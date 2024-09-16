package com.breezefieldsalessunriselift.features.stockAddCurrentStock.api

import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalessunriselift.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalessunriselift.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalessunriselift.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalessunriselift.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}