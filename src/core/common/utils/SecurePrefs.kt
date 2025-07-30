package com.elemsocial.core.common.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.IvParameterSpec

@SuppressLint("ApplySharedPref")
class SecurePrefs private constructor(context: Context) {

    companion object {
        private const val PREFS_NAME = "secure_shared_prefs"
        private const val KEY_ALIAS = "secure_prefs_key_alias"
        private const val IV_KEY = "secure_prefs_iv"

        @Volatile
        private var instance: SecurePrefs? = null

        fun initialize(context: Context): SecurePrefs {
            return instance ?: synchronized(this) {
                instance ?: SecurePrefs(context.applicationContext).also { instance = it }
            }
        }

        fun getInstance(): SecurePrefs {
            return instance ?: throw IllegalStateException("SecurePrefs not initialized. Call initialize() first.")
        }
    }

    private val masterKey: MasterKey
    private val sharedPreferences: SharedPreferences

    init {
        masterKey = MasterKey.Builder(context, KEY_ALIAS)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        sharedPreferences = EncryptedSharedPreferences.create(
            context,
            PREFS_NAME,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )

        ensureInitializationVector()
    }

    private fun ensureInitializationVector() {
        if (!sharedPreferences.contains(IV_KEY)) {
            val iv = generateInitializationVector()
            sharedPreferences.edit()
                .putString(IV_KEY, iv)
                .commit()
        }
    }

    private fun generateInitializationVector(): String {
        val keyGenerator = KeyGenerator.getInstance("AES").apply {
            init(256)
        }
        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding")
        cipher.init(Cipher.ENCRYPT_MODE, keyGenerator.generateKey())
        return Base64.encodeToString(cipher.iv, Base64.NO_WRAP)
    }

    private fun getInitializationVector(): ByteArray {
        val ivString = sharedPreferences.getString(IV_KEY, null)
            ?: throw IllegalStateException("Initialization vector not found")
        return Base64.decode(ivString, Base64.NO_WRAP)
    }

    /* Basic Operations */
    fun putString(key: String, value: String) {
        sharedPreferences.edit()
            .putString(key, value)
            .apply()
    }

    fun getString(key: String, defaultValue: String? = null): String? {
        return sharedPreferences.getString(key, defaultValue)
    }

    fun putInt(key: String, value: Int) {
        sharedPreferences.edit()
            .putInt(key, value)
            .apply()
    }

    fun getInt(key: String, defaultValue: Int = 0): Int {
        return sharedPreferences.getInt(key, defaultValue)
    }

    fun putLong(key: String, value: Long) {
        sharedPreferences.edit()
            .putLong(key, value)
            .apply()
    }

    fun getLong(key: String, defaultValue: Long = 0L): Long {
        return sharedPreferences.getLong(key, defaultValue)
    }

    fun putBoolean(key: String, value: Boolean) {
        sharedPreferences.edit()
            .putBoolean(key, value)
            .apply()
    }

    fun getBoolean(key: String, defaultValue: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(key, defaultValue)
    }

    fun putFloat(key: String, value: Float) {
        sharedPreferences.edit()
            .putFloat(key, value)
            .apply()
    }

    fun getFloat(key: String, defaultValue: Float = 0f): Float {
        return sharedPreferences.getFloat(key, defaultValue)
    }

    /* Complex Operations */
    fun remove(key: String) {
        sharedPreferences.edit()
            .remove(key)
            .apply()
    }

    fun clear() {
        sharedPreferences.edit()
            .clear()
            .commit() // Use commit() for important operations
    }

    fun contains(key: String): Boolean {
        return sharedPreferences.contains(key)
    }

    /* Secure Operations */
    fun putEncryptedString(key: String, value: String) {
        val encrypted = encrypt(value)
        putString(key, encrypted)
    }

    fun getDecryptedString(key: String, defaultValue: String? = null): String? {
        val encrypted = getString(key) ?: return defaultValue
        return try {
            decrypt(encrypted)
        } catch (e: Exception) {
            defaultValue
        }
    }

    private fun encrypt(data: String): String {
        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding").apply {
            init(Cipher.ENCRYPT_MODE, getSecretKey(), IvParameterSpec(getInitializationVector()))
        }
        val encryptedBytes = cipher.doFinal(data.toByteArray(Charsets.UTF_8))
        return Base64.encodeToString(encryptedBytes, Base64.NO_WRAP)
    }

    private fun decrypt(encryptedData: String): String {
        val encryptedBytes = Base64.decode(encryptedData, Base64.NO_WRAP)
        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding").apply {
            init(Cipher.DECRYPT_MODE, getSecretKey(), IvParameterSpec(getInitializationVector()))
        }
        val decryptedBytes = cipher.doFinal(encryptedBytes)
        return String(decryptedBytes, Charsets.UTF_8)
    }

    private fun getSecretKey(): SecretKey {
        val keyStore = KeyStore.getInstance("AndroidKeyStore").apply {
            load(null)
        }

        if (!keyStore.containsAlias(KEY_ALIAS)) {
            val keyGenerator = KeyGenerator.getInstance(
                KeyProperties.KEY_ALGORITHM_AES,
                "AndroidKeyStore"
            )

            val keyGenParameterSpec = KeyGenParameterSpec.Builder(
                KEY_ALIAS,
                KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
            )
                .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS7)
                .setKeySize(256)
                .build()

            keyGenerator.init(keyGenParameterSpec)
            keyGenerator.generateKey()
        }

        return keyStore.getKey(KEY_ALIAS, null) as SecretKey
    }

    /* Bulk Operations */
    fun putAll(values: Map<String, Any>) {
        val editor = sharedPreferences.edit()
        values.forEach { (key, value) ->
            when (value) {
                is String -> editor.putString(key, value)
                is Int -> editor.putInt(key, value)
                is Long -> editor.putLong(key, value)
                is Float -> editor.putFloat(key, value)
                is Boolean -> editor.putBoolean(key, value)
            }
        }
        editor.apply()
    }

    fun getAll(): Map<String, *> {
        return sharedPreferences.all
    }

    /* Migration Helpers */
    fun migrateFrom(unsecurePrefs: SharedPreferences) {
        val editor = sharedPreferences.edit()
        unsecurePrefs.all.forEach { (key, value) ->
            when (value) {
                is String -> editor.putString(key, value)
                is Int -> editor.putInt(key, value)
                is Long -> editor.putLong(key, value)
                is Float -> editor.putFloat(key, value)
                is Boolean -> editor.putBoolean(key, value)
            }
        }
        editor.commit() // исп: editor()  >> далее class.name
    }
}