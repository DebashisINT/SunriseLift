package com.breezefieldsalessunriselift.features.viewAllOrder.interf

import com.breezefieldsalessunriselift.app.domain.NewOrderColorEntity
import com.breezefieldsalessunriselift.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}