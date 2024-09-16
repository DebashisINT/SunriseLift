package com.breezefieldsalessunriselift.features.viewAllOrder.model

import com.breezefieldsalessunriselift.base.BaseResponse

/**
 * Created by Saikat on 01-10-2018.
 */
class ViewAllOrderListResponseModel : BaseResponse() {
    var order_details_list: List<ViewAllOrderListDataModel>? = null
}