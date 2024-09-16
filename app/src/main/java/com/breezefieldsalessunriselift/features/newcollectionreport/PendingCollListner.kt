package com.breezefieldsalessunriselift.features.newcollectionreport

import com.breezefieldsalessunriselift.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}