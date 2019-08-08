package com.lambdaschool.android.organization.application.application.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class DateUtils {
    companion object {
        fun formatDate(date: Date) : String {
            val format = SimpleDateFormat("dd/MM/yyy")
            return format.format(date)
        }

        // TODO: Other date formatting util methods here...
        @SuppressLint("NewApi")
        val current = LocalDateTime.now()

        @SuppressLint("NewApi")
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        @SuppressLint("NewApi")
        val formatted = current.format(formatter)


    }
}
