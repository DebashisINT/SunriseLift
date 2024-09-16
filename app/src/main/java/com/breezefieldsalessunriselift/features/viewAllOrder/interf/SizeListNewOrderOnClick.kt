package com.breezefieldsalessunriselift.features.viewAllOrder.interf

import com.breezefieldsalessunriselift.app.domain.NewOrderProductEntity
import com.breezefieldsalessunriselift.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}