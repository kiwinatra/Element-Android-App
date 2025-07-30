package com.elemsocial.core.common.extensions

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

object DateTimeExt {

    // ISO-8601 formatter with timezone
    private val isoFormatter: DateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    
    // Human readable formats
    private val humanDateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy")
    private val humanTimeFormat = DateTimeFormatter.ofPattern("HH:mm")
    private val humanDateTimeFormat = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm")
    
    // Legacy date formatter for pre-API 26
    @SuppressLint("SimpleDateFormat")
    private val legacyFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

    /* String Conversions */
    
    fun String.toLocalDateTime(): LocalDateTime {
        return try {
            if (isAndroidOreoOrHigher()) {
                LocalDateTime.parse(this, isoFormatter)
            } else {
                legacyFormat.parse(this)?.toInstant()?.toLocalDateTime() 
                    ?: throw IllegalArgumentException("Invalid date format")
            }
        } catch (e: Exception) {
            throw DateTimeException("Failed to parse date string: $this")
        }
    }
    
    fun LocalDateTime.toIsoString(): String {
        return if (isAndroidOreoOrHigher()) {
            this.format(isoFormatter)
        } else {
            legacyFormat.format(Date.from(this.toInstant()))
        }
    }
    
    /* Human readable formats */
    
    fun LocalDateTime.toHumanDateString(): String {
        return this.format(humanDateFormat)
    }
    
    fun LocalDateTime.toHumanTimeString(): String {
        return this.format(humanTimeFormat)
    }
    
    fun LocalDateTime.toHumanDateTimeString(): String {
        return this.format(humanDateTimeFormat)
    }
    
    /* Time calculations */
    
    fun LocalDateTime.timeAgo(): String {
        val now = LocalDateTime.now()
        val diff = ChronoUnit.SECONDS.between(this, now)
        
        return when {
            diff < 60 -> "$diff seconds ago"
            diff < 3600 -> "${diff / 60} minutes ago"
            diff < 86400 -> "${diff / 3600} hours ago"
            diff < 2592000 -> "${diff / 86400} days ago"
            diff < 31536000 -> "${diff / 2592000} months ago"
            else -> "${diff / 31536000} years ago"
        }
    }
    
    fun LocalDateTime.isToday(): Boolean {
        return this.toLocalDate() == LocalDate.now()
    }
    
    fun LocalDateTime.isYesterday(): Boolean {
        return this.toLocalDate() == LocalDate.now().minusDays(1)
    }
    
    /* Timezone conversions */
    
    fun LocalDateTime.toZone(zoneId: ZoneId): LocalDateTime {
        return this.atZone(ZoneId.systemDefault())
            .withZoneSameInstant(zoneId)
            .toLocalDateTime()
    }
    
    /* Helper extensions */
    
    private fun Instant.toLocalDateTime(): LocalDateTime {
        return LocalDateTime.ofInstant(this, ZoneId.systemDefault())
    }
    
    private fun isAndroidOreoOrHigher(): Boolean {
        return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O
    }
    
    /* Duration formatting */
    
    fun Duration.toHumanString(): String {
        return when {
            this.toMinutes() < 1 -> "${this.seconds}s"
            this.toHours() < 1 -> "${this.toMinutes()}m"
            this.toDays() < 1 -> "${this.toHours()}h"
            else -> "${this.toDays()}d"
        }
    }
    
    /* Calendar operations */
    
    fun LocalDateTime.toCalendar(): Calendar {
        return Calendar.getInstance().apply {
            time = Date.from(this@toCalendar.toInstant())
        }
    }
    
    /* Date validation */
    
    fun String.isValidIsoDate(): Boolean {
        return try {
            this.toLocalDateTime()
            true
        } catch (e: Exception) {
            false
        }
    }
    
    /* Period calculations */
    
    fun LocalDateTime.daysUntil(other: LocalDateTime): Long {
        return ChronoUnit.DAYS.between(this, other)
    }
    
    fun LocalDateTime.hoursUntil(other: LocalDateTime): Long {
        return ChronoUnit.HOURS.between(this, other)
    }
    
    /* Date manipulation */
    
    fun LocalDateTime.plusDays(days: Long): LocalDateTime {
        return this.plusDays(days)
    }
    
    fun LocalDateTime.minusDays(days: Long): LocalDateTime {
        return this.minusDays(days)
    }
    
    fun LocalDateTime.startOfDay(): LocalDateTime {
        return this.toLocalDate().atStartOfDay()
    }
    
    fun LocalDateTime.endOfDay(): LocalDateTime {
        return this.toLocalDate().atTime(LocalTime.MAX)
    }
    
    /* Comparison helpers */
    
    fun LocalDateTime.isAfterNow(): Boolean {
        return this.isAfter(LocalDateTime.now())
    }
    
    fun LocalDateTime.isBeforeNow(): Boolean {
        return this.isBefore(LocalDateTime.now())
    }
    
    /* Epoch conversions */
    
    fun LocalDateTime.toEpochMillis(): Long {
        return this.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
    }
    
    fun Long.toLocalDateTime(): LocalDateTime {
        return Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDateTime()
    }
    
    /* Week operations */
    
    fun LocalDateTime.dayOfWeekName(): String {
        return this.dayOfWeek.toString().lowercase().replaceFirstChar { it.uppercase() }
    }
    
    fun LocalDateTime.isWeekend(): Boolean {
        return this.dayOfWeek == DayOfWeek.SATURDAY || this.dayOfWeek == DayOfWeek.SUNDAY
    }
    
    /* Month operations */
    
    fun LocalDateTime.monthName(): String {
        return this.month.toString().lowercase().replaceFirstChar { it.uppercase() }
    }
    
    fun LocalDateTime.daysInMonth(): Int {
        return this.month.length(this.toLocalDate().isLeapYear)
    }
}