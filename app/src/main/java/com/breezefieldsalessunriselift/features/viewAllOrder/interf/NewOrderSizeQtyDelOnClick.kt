package com.breezefieldsalessunriselift.features.viewAllOrder.interf

import com.breezefieldsalessunriselift.app.domain.NewOrderGenderEntity
import com.breezefieldsalessunriselift.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}