package com.lambdaschool.android.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.R
import com.lambdaschool.android.model.Product
import com.lambdaschool.android.util.DateUtils
import com.lambdaschool.android.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails()
    }

    private fun displayProductDetails() {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        val milkbox = Product("Milk", "Milk in a box", 1.50, 0.2, 0.05)
        productName.text = milkbox.productName
        productDescription.text = milkbox.productDescription
        productPrice.text = TextUtils.formatCurrency(milkbox.productPrice)
        productTax.text = TextUtils.formatCurrency(milkbox.productTax)
        productDiscount.text = TextUtils.formatPercent(milkbox.productDiscount)

        orderDate.text = DateUtils.formatDate(Date())
    }
}
