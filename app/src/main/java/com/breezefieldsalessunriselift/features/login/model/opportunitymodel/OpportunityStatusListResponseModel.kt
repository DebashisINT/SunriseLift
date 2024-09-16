package com.breezefieldsalessunriselift.features.login.model.opportunitymodel

import com.breezefieldsalessunriselift.app.domain.OpportunityStatusEntity
import com.breezefieldsalessunriselift.app.domain.ProductListEntity
import com.breezefieldsalessunriselift.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}