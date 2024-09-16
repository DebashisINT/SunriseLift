package com.breezefieldsalessunriselift.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalessunriselift.app.FileUtils
import com.breezefieldsalessunriselift.app.Pref
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.addshop.model.AddLogReqData
import com.breezefieldsalessunriselift.features.addshop.model.AddShopRequestData
import com.breezefieldsalessunriselift.features.addshop.model.AddShopResponse
import com.breezefieldsalessunriselift.features.addshop.model.LogFileResponse
import com.breezefieldsalessunriselift.features.addshop.model.UpdateAddrReq
import com.breezefieldsalessunriselift.features.contacts.CallHisDtls
import com.breezefieldsalessunriselift.features.contacts.CompanyReqData
import com.breezefieldsalessunriselift.features.contacts.ContactMasterRes
import com.breezefieldsalessunriselift.features.contacts.SourceMasterRes
import com.breezefieldsalessunriselift.features.contacts.StageMasterRes
import com.breezefieldsalessunriselift.features.contacts.StatusMasterRes
import com.breezefieldsalessunriselift.features.contacts.TypeMasterRes
import com.breezefieldsalessunriselift.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalessunriselift.features.login.model.WhatsappApiData
import com.breezefieldsalessunriselift.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}