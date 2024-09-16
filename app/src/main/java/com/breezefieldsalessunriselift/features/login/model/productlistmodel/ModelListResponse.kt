package com.breezefieldsalessunriselift.features.login.model.productlistmodel

import com.breezefieldsalessunriselift.app.domain.ModelEntity
import com.breezefieldsalessunriselift.app.domain.ProductListEntity
import com.breezefieldsalessunriselift.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}