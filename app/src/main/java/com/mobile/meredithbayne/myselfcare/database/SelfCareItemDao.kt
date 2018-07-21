package com.mobile.meredithbayne.myselfcare.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*


@Dao
interface SelfCareItemDao {
    @Query("SELECT * FROM items")
    fun loadAllItems(): LiveData<List<SelfCareItem>>

    @Insert
    fun insertItem(taskEntry: SelfCareItem)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateItem(taskEntry: SelfCareItem)

    @Delete
    fun deleteItem(taskEntry: SelfCareItem)

    @Query("SELECT * FROM items WHERE id = :id")
    fun loadItemById(id: Int): LiveData<SelfCareItem>
}