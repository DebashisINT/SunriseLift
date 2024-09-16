package com.breezefieldsalessunriselift.features.newcollection.model

import com.breezefieldsalessunriselift.app.domain.CollectionDetailsEntity
import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}