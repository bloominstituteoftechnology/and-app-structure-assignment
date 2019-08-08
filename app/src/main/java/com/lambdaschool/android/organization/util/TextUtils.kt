package com.lambdaschool.android.organization.application.application.util

import java.text.NumberFormat

object TextUtils {

        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price : Double) : String {
            return NumberFormat.getCurrencyInstance().format(price)
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount : Double) : String {
            return "${NumberFormat.getCurrencyInstance().format(discount)} discount"
        }
        fun formatProductName(product: String, describe: String): String {
            return "$product $describe"
        }
    }
