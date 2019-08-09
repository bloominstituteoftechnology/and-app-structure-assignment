package com.lambdaschool.android.organization.Util

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun formatDate(date: Date) : String {
            val format = SimpleDateFormat("dd/MM/yyyy")
            return format.format(date)
        }

        // TODO: Other date formatting util methods here...
    }
}