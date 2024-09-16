package com.breezefieldsalessunriselift.features.nearbyuserlist.api

import com.breezefieldsalessunriselift.app.Pref
import com.breezefieldsalessunriselift.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalessunriselift.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalessunriselift.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}