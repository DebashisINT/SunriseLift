package com.breezefieldsalessunriselift.features.viewAllOrder.interf

import com.breezefieldsalessunriselift.app.domain.NewOrderGenderEntity
import com.breezefieldsalessunriselift.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}