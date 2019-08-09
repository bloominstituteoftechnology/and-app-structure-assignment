package com.lambdaschool.android.organization.UI

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.Model.Product
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.Util.DateUtils
import com.lambdaschool.android.organization.Util.TextUtils
import com.lambdaschool.android.organization.application.LambdaApplication
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails((application as LambdaApplication).appItem)
    }

    private fun displayProductDetails(product:Product) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        productPrice.text = TextUtils.formatCurrency(product.price)
        productName.text = TextUtils.formatItem(product.item)
        productDescription.text = TextUtils.formatDiscription(product.item)
        productTax.text = TextUtils.formatTax(product.tax)
        productDiscount.text = TextUtils.formatPercent(product.productdiscount)
        orderDate.text = DateUtils.formatDate(product.orderDate)
        totalProductPrice.text = TextUtils.formatTotal(product.itemtotal)
    }
}
