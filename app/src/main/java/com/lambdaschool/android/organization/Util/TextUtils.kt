package com.lambdaschool.android.organization.Util

import java.text.NumberFormat

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price: Double): String {
            return "${NumberFormat.getCurrencyInstance().format(price)} price"
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount: Double): String {
            return "${NumberFormat.getPercentInstance().format(discount)} discount"
        }

        fun formatItem(item: String): String {
            return "$item"
        }

        fun formatDiscription(discription: String): String {
            return "$discription"
        }

        fun formatTax(tax: Double): String {
            return "${NumberFormat.getPercentInstance().format(tax)} tax"

        }
        fun formatTotal(pricetotal:Double):String{
            return "${NumberFormat.getCurrencyInstance().format(pricetotal)}pricetotal"
        }
    }
}