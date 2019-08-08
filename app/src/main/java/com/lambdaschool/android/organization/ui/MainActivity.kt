package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails()
    }

    private fun displayProductDetails() {
        productName.text = "Ronnie's sneakers"
        productDescription.text = "Running shoes for the elegant man"
        productPrice.text = TextUtils.formatCurrency(100.00)
        productTax.text = TextUtils.formatCurrency(50.00)
        totalProductPrice.text = TextUtils.formatCurrency(150.00)
        productDiscount.text = TextUtils.formatPercent(5.00)
        orderDate.text = DateUtils.formatDate(1565296505)
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
    }
}
