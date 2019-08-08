package com.lambdaschool.android.organization.model

class Product (
    val productName: String = "The Legend of Zelda: Breath of the Wild",
    val productDescription: String = "Nintendo Switch video game",
    val productPrice: Double = 60.00,
    val productTax: Double = productPrice * .09,
    val productDiscount: Double = .10
)
