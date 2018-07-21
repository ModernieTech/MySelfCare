package com.mobile.meredithbayne.myselfcare.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "items")
class SelfCareItem(@PrimaryKey(autoGenerate = true)
                   val id: Int?,
                   val description: String,
                   val frequency: String,
                   val category: String)