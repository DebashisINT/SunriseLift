package com.breezefieldsalessunriselift.features.task.api

import com.breezefieldsalessunriselift.features.timesheet.api.TimeSheetApi
import com.breezefieldsalessunriselift.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}