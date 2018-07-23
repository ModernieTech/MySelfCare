package com.mobile.meredithbayne.myselfcare.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.RecyclerView
import com.mobile.meredithbayne.myselfcare.R

class SelfCareListActivity : AppCompatActivity() {
    private val TAG = "SelfCareListActivity"

    private lateinit var viewModel: SelfCareListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.self_care_list_activity)
    }

}
