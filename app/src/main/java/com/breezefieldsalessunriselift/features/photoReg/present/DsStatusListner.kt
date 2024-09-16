package com.breezefieldsalessunriselift.features.photoReg.present

import com.breezefieldsalessunriselift.app.domain.ProspectEntity
import com.breezefieldsalessunriselift.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}