package com.lambdaschool.android.organization.application.application.model

data class Model(
    val productName: String = "Lambda",
    val productDescription: String = "Greatest Product in the world",
    val productPrice: Double = 123.25,
    val productTax: Double = productPrice * .085,
    val productDiscount: Double = .10
)