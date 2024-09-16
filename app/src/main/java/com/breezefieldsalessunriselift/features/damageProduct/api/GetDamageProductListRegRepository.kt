package com.breezefieldsalessunriselift.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalessunriselift.app.FileUtils
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.NewQuotation.model.*
import com.breezefieldsalessunriselift.features.addshop.model.AddShopRequestData
import com.breezefieldsalessunriselift.features.addshop.model.AddShopResponse
import com.breezefieldsalessunriselift.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalessunriselift.features.damageProduct.model.delBreakageReq
import com.breezefieldsalessunriselift.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalessunriselift.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalessunriselift.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalessunriselift.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}