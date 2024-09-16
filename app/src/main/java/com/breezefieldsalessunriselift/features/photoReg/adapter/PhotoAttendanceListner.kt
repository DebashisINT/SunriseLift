package com.breezefieldsalessunriselift.features.photoReg.adapter

import com.breezefieldsalessunriselift.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}