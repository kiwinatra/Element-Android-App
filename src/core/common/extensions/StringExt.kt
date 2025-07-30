package com.elemsocial.core.common.extensions

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.util.Base64
import android.util.Patterns
import androidx.annotation.ColorInt
import java.security.MessageDigest
import java.text.Normalizer
import java.util.*
import java.util.regex.Pattern
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

object StringExt {

    /* Basic Validation */
    fun String?.isNotNullOrEmpty(): Boolean = !this.isNullOrEmpty()
    fun String?.isNullOrBlank(): Boolean = this == null || this.isBlank()
    fun String.isValidEmail(): Boolean = Patterns.EMAIL_ADDRESS.matcher(this).matches()
    fun String.isValidUrl(): Boolean = Patterns.WEB_URL.matcher(this).matches()
    fun String.isValidPhone(): Boolean = Patterns.PHONE.matcher(this).matches()
    fun String.isValidIpAddress(): Boolean = Pattern.compile(
        "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"
    ).matcher(this).matches()

    /* String Manipulation */
    fun String.capitalizeWords(): String = split(" ").joinToString(" ") { it.capitalize() }
    fun String.removeWhitespaces(): String = replace("\\s".toRegex(), "")
    fun String.normalize(): String = Normalizer.normalize(this, Normalizer.Form.NFD)
        .replace("[^\\p{ASCII}]".toRegex(), "")
    fun String.reverse(): String = StringBuilder(this).reverse().toString()
    fun String.truncate(maxLength: Int, suffix: String = "..."): String =
        if (length <= maxLength) this else substring(0, maxLength) + suffix

    /* Encoding/Decoding */
    fun String.toBase64(): String = Base64.encodeToString(toByteArray(), Base64.NO_WRAP)
    fun String.fromBase64(): String = String(Base64.decode(this, Base64.NO_WRAP))
    fun String.toMd5(): String = hashWithAlgorithm("MD5")
    fun String.toSha1(): String = hashWithAlgorithm("SHA-1")
    fun String.toSha256(): String = hashWithAlgorithm("SHA-256")
    fun String.toHmacSha256(key: String): String {
        val secretKey = SecretKeySpec(key.toByteArray(), "HmacSHA256")
        val mac = Mac.getInstance("HmacSHA256").apply { init(secretKey) }
        return Base64.encodeToString(mac.doFinal(toByteArray()), Base64.NO_WRAP)
    }

    /* Formatting */
    fun String.toSpannable(): Spannable = SpannableString(this)
    fun String.colorize(@ColorInt color: Int): Spanned {
        return SpannableString(this).apply {
            setSpan(ForegroundColorSpan(color), 0, length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }
    fun String.ellipsize(maxLength: Int): String =
        if (length <= maxLength) this else TextUtils.ellipsize(
            this,
            android.text.TextPaint(),
            maxLength.toFloat(),
            TextUtils.TruncateAt.END
        ).toString()

    /* Utility */
    fun String.containsIgnoreCase(other: String): Boolean =
        this.lowercase(Locale.getDefault()).contains(other.lowercase(Locale.getDefault()))
    fun String.equalsIgnoreCase(other: String): Boolean =
        this.lowercase(Locale.getDefault()) == other.lowercase(Locale.getDefault())
    fun String.countOccurrences(substring: String): Int = split(substring).size - 1
    fun String.extractNumbers(): String = replace("[^0-9]".toRegex(), "")
    fun String.extractLetters(): String = replace("[^a-zA-Z]".toRegex(), "")
    fun String.removeAccents(): String = Normalizer.normalize(this, Normalizer.Form.NFD)
        .replace("[^\\p{ASCII}]".toRegex(), "")

    /* Advanced Search */
    fun String.findEmails(): List<String> {
        val pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}")
        return pattern.matcher(this).run {
            val emails = mutableListOf<String>()
            while (find()) emails.add(group())
            emails
        }
    }

    fun String.findUrls(): List<String> {
        val pattern = Pattern.compile(
            "(https?:\\/\\/)?([\\w\\-])+\\.{1}([a-zA-Z]{2,63})([\\/\\w-]*)*\\/??\\??([^#\\n\\r]*)?#?([^\\n\\r]*)"
        )
        return pattern.matcher(this).run {
            val urls = mutableListOf<String>()
            while (find()) urls.add(group())
            urls
        }
    }

    /* Secure Operations */
    fun String.mask(start: Int = 0, end: Int = length, maskChar: Char = '*'): String {
        if (start < 0 || end > length || start > end) return this
        return substring(0, start) + maskChar.toString().repeat(end - start) + substring(end)
    }

    fun String.secureEquals(other: String): Boolean {
        return MessageDigest.isEqual(this.toByteArray(), other.toByteArray())
    }

    /* Localization */
    fun String.toTitleCase(locale: Locale = Locale.getDefault()): String {
        return split(" ").joinToString(" ") {
            it.replaceFirstChar { char -> char.uppercase(locale) }
        }
    }

    /* Private Helpers */
    private fun String.hashWithAlgorithm(algorithm: String): String {
        return MessageDigest.getInstance(algorithm).digest(toByteArray())
            .joinToString("") { "%02x".format(it) }
    }

    /* HTML/XML */
    fun String.escapeHtml(): String {
        return this.replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&#39;")
    }

    fun String.unescapeHtml(): String {
        return this.replace("&amp;", "&")
            .replace("&lt;", "<")
            .replace("&gt;", ">")
            .replace("&quot;", "\"")
            .replace("&#39;", "'")
    }

    /* Cryptography */
    fun String.encryptAes(key: String, iv: String): String {
        val cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding")
        val keySpec = javax.crypto.spec.SecretKeySpec(key.toByteArray(), "AES")
        val ivSpec = javax.crypto.spec.IvParameterSpec(iv.toByteArray())
        cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, keySpec, ivSpec)
        return Base64.encodeToString(cipher.doFinal(toByteArray()), Base64.NO_WRAP)
    }

    fun String.decryptAes(key: String, iv: String): String {
        val cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding")
        val keySpec = javax.crypto.spec.SecretKeySpec(key.toByteArray(), "AES")
        val ivSpec = javax.crypto.spec.IvParameterSpec(iv.toByteArray())
        cipher.init(javax.crypto.Cipher.DECRYPT_MODE, keySpec, ivSpec)
        return String(cipher.doFinal(Base64.decode(this, Base64.NO_WRAP)))
    }

    /* Performance Optimized */
    fun String.countLines(): Int = count { it == '\n' } + 1
    fun String.isPalindrome(): Boolean = this == reverse()
    fun String.removeDuplicates(): String = toCharArray().distinct().joinToString("")
    fun String.removeSubstring(substring: String): String = replace(substring, "")
    fun String.wrap(prefix: String, suffix: String): String = "$prefix$this$suffix"
    fun String.wrapIf(condition: Boolean, prefix: String, suffix: String): String =
        if (condition) wrap(prefix, suffix) else this
}