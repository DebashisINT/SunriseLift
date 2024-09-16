package com.breezefieldsalessunriselift.features.survey.api

import com.breezefieldsalessunriselift.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalessunriselift.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}