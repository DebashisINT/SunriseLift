package com.breezefieldsalessunriselift.features.stock.api

import com.breezefieldsalessunriselift.app.Pref
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.stock.model.AddStockInputParamsModel
import com.breezefieldsalessunriselift.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 17-09-2019.
 */
class StockRepository(val apiService: StockApi) {

    fun addStock(addStock: AddStockInputParamsModel): Observable<BaseResponse> {
        return apiService.addStock(addStock)
    }

    fun getStockList(): Observable<NewStockListResponseModel> {
        return apiService.getStockList(Pref.session_token!!, Pref.user_id!!)
    }
}