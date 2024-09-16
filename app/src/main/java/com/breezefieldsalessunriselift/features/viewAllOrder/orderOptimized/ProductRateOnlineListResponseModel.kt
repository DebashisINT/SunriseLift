package com.breezefieldsalessunriselift.features.viewAllOrder.orderOptimized

import com.breezefieldsalessunriselift.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}