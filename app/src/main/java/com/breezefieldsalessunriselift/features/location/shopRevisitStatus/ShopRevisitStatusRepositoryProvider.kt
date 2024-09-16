package com.breezefieldsalessunriselift.features.location.shopRevisitStatus

import com.breezefieldsalessunriselift.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalessunriselift.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}