package com.lambdaschool.android.organization.model

class Product(
    val productName: String = "Product",
    val productDescription: String = "Does product things",
    val productPrice: Double = 100.00,
    val productTax: Double = productPrice * .075,
    val productDiscount: Double = .20
)