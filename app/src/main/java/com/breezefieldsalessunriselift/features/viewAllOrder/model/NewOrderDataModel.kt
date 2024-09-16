package com.breezefieldsalessunriselift.features.viewAllOrder.model

import com.breezefieldsalessunriselift.app.domain.NewOrderColorEntity
import com.breezefieldsalessunriselift.app.domain.NewOrderGenderEntity
import com.breezefieldsalessunriselift.app.domain.NewOrderProductEntity
import com.breezefieldsalessunriselift.app.domain.NewOrderSizeEntity
import com.breezefieldsalessunriselift.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

