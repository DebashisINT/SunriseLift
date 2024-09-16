package com.breezefieldsalessunriselift.features.document.api

import com.breezefieldsalessunriselift.features.dymanicSection.api.DynamicApi
import com.breezefieldsalessunriselift.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}