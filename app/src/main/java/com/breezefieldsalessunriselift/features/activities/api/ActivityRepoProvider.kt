package com.breezefieldsalessunriselift.features.activities.api

import com.breezefieldsalessunriselift.features.member.api.TeamApi
import com.breezefieldsalessunriselift.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}