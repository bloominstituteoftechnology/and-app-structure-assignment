package com.lambdaschool.android.organization.util

import android.util.EventLogTags
import java.text.NumberFormat

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(productPrice : Double) : String {
            return NumberFormat.getCurrencyInstance().format(productPrice)
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(productDiscount : Double) : String {
            return NumberFormat.getPercentInstance().format(productDiscount)
        }

        fun formatName(productName: String): String {
            return "$productName"
        }

        fun formatDescription(productDescription: String): String{
            return "$productDescription"
        }
    }
}