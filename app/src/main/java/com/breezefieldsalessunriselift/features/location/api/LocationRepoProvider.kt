package com.breezefieldsalessunriselift.features.location.api

import com.breezefieldsalessunriselift.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalessunriselift.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}