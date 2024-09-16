package com.breezefieldsalessunriselift.features.location.api

import com.breezefieldsalessunriselift.app.Pref
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.location.model.AppInfoInputModel
import com.breezefieldsalessunriselift.features.location.model.AppInfoResponseModel
import com.breezefieldsalessunriselift.features.location.model.GpsNetInputModel
import com.breezefieldsalessunriselift.features.location.model.ShopDurationRequest
import com.breezefieldsalessunriselift.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}