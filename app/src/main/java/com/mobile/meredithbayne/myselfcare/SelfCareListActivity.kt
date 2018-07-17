package com.mobile.meredithbayne.myselfcare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.RecyclerView

class SelfCareListActivity : AppCompatActivity() {
    private val TAG = "SelfCareListActivity"

    lateinit var selfCareList: RecyclerView
    lateinit var addItemButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.self_care_list_activity)
        if (savedInstanceState == null) {
            // do things
        }
    }

}
