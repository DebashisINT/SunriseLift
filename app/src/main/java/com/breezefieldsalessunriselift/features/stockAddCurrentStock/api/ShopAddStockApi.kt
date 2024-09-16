package com.breezefieldsalessunriselift.features.stockAddCurrentStock.api

import com.breezefieldsalessunriselift.app.NetworkConstant
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalessunriselift.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalessunriselift.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalessunriselift.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ShopAddStockApi {

    @POST("Stock/AddCurrentStock")
    fun submShopAddStock(@Body shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("Stock/CurrentStockList")
    fun getCurrStockListApi(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("date") date: String):
            Observable<CurrentStockGetData>

    companion object Factory {
        fun create(): ShopAddStockApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(ShopAddStockApi::class.java)
        }
    }

}