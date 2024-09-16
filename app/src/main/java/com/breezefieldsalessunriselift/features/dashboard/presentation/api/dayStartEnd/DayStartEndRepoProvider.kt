package com.breezefieldsalessunriselift.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalessunriselift.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalessunriselift.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}