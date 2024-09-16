package com.breezefieldsalessunriselift.features.location.shopRevisitStatus

import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.location.model.ShopDurationRequest
import com.breezefieldsalessunriselift.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}