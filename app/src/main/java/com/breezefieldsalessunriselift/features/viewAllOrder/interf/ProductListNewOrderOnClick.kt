package com.breezefieldsalessunriselift.features.viewAllOrder.interf

import com.breezefieldsalessunriselift.app.domain.NewOrderGenderEntity
import com.breezefieldsalessunriselift.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}