package com.breezefieldsalessunriselift.features.chat.api

import com.breezefieldsalessunriselift.app.Pref
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.billing.api.billinglistapi.BillingListApi
import com.breezefieldsalessunriselift.features.billing.model.BillingListResponseModel
import com.breezefieldsalessunriselift.features.chat.model.ChatListResponseModel
import com.breezefieldsalessunriselift.features.chat.model.ChatUserResponseModel
import com.breezefieldsalessunriselift.features.chat.model.GroupUserResponseModel
import io.reactivex.Observable

class ChatRepo(val apiService: ChatApi) {
    fun getChatUserList(): Observable<ChatUserResponseModel> {
        return apiService.chatUserList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getChatList(opponent_id: String, pageNo: String, pageCount: String): Observable<ChatListResponseModel> {
        return apiService.chatList(Pref.session_token!!, Pref.user_id!!, opponent_id, pageNo, pageCount)
    }

    fun sendChat(msgID: String, msg: String, toID: String, time: String): Observable<BaseResponse> {
        return apiService.sendChat(Pref.session_token!!, Pref.user_id!!, msgID, msg, toID, time, Pref.user_name!!)
    }

    fun getGroupUserList(): Observable<GroupUserResponseModel> {
        return apiService.groupUserList(Pref.session_token!!, Pref.user_id!!)
    }

    fun addGroup(grp_name: String, ids: String): Observable<BaseResponse> {
        return apiService.addGrp(Pref.session_token!!, Pref.user_id!!, grp_name, ids)
    }

    fun addMember(grp_id: String, ids: String): Observable<BaseResponse> {
        return apiService.addMember(Pref.session_token!!, Pref.user_id!!, grp_id, ids)
    }

    fun memberUserList(grp_id: String): Observable<GroupUserResponseModel> {
        return apiService.memberUserList(Pref.session_token!!, Pref.user_id!!, grp_id)
    }

    fun grpMemberList(grp_id: String): Observable<GroupUserResponseModel> {
        return apiService.grpMemberList(Pref.session_token!!, Pref.user_id!!, grp_id)
    }

    fun updateChatStatus(to_id: String): Observable<BaseResponse> {
        return apiService.updateChatStatus(Pref.session_token!!, Pref.user_id!!, to_id)
    }
}