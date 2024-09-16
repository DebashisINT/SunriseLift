package com.breezefieldsalessunriselift.features.mylearning.apiCall

import com.breezefieldsalessunriselift.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalessunriselift.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}