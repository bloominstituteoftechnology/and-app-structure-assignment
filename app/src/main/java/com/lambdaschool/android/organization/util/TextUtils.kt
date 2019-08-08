package com.lambdaschool.android.organization.util

import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

class TextUtils {
    companion object {

        fun formatCurrency(price : Double) : String {
            return NumberFormat.getCurrencyInstance().format(price)
        }


        fun formatPercent(discount : Double) : String {
            return "${NumberFormat.getPercentInstance().format(discount)}"
        }


    }
}