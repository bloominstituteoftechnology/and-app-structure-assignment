package com.lambdaschool.android.organization.model

import java.util.*

data class Product(
    val productName:String = "Chocolate",
    val  productDescription:String = "Milk Chocolate with whole hazelnuts",
    val productPrice:Double= 5.50,
    val productTax:Double= productPrice * .085,
    val totalProductPrice:Double=productPrice+productTax,
    val productDiscount:Double = .10
)