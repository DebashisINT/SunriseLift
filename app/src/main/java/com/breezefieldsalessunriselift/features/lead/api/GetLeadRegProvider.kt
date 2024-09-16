package com.breezefieldsalessunriselift.features.lead.api

import com.breezefieldsalessunriselift.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalessunriselift.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}