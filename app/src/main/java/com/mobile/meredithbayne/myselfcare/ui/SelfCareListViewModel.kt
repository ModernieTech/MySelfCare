package com.mobile.meredithbayne.myselfcare.ui

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.mobile.meredithbayne.myselfcare.persistence.SelfCareDatabase
import com.mobile.meredithbayne.myselfcare.persistence.SelfCareItem

class SelfCareListViewModel(application: Application) : AndroidViewModel(application) {
    var selfCareItemList: LiveData<List<SelfCareItem>>

    init {
        val appDb: SelfCareDatabase = SelfCareDatabase.getInstance(this.getApplication())
        selfCareItemList = appDb.selfCareItemDao().loadAllItems()
    }

    fun getSelfCareItems(): LiveData<List<SelfCareItem>> {
        return selfCareItemList
    }
}
