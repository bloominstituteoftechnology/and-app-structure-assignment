package com.lambdaschool.android.organization.application.application.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.application.application.application.LambdaApplication
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.application.application.model.Model
import com.lambdaschool.android.organization.application.application.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails((application as LambdaApplication).appOrder)
    }
        //val productNam
        //val productDes
        //val productPri
        //val productTax
        //val productDis
    private fun displayProductDetails(order: Model) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        productName.text = "Lambda"
        productDescription.text = TextUtils.formatProductName(order.productDescription, order.productName)
        productPrice.text = TextUtils.formatCurrency(order.productPrice)
        productTax.text = TextUtils.formatCurrency(order.productTax)
        productDiscount.text = TextUtils.formatPercent(order.productDiscount)
    }
}
