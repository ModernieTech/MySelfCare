package com.mobile.meredithbayne.myselfcare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.RadioButton

class AddSelfCareItemActivity : AppCompatActivity() {
    private val TAG = "AddSelfCareItemActivity"

    lateinit var addItemInput: EditText
    lateinit var physicalButton: RadioButton
    lateinit var emotionalButton: RadioButton
    lateinit var socialButton: RadioButton
    lateinit var dailyButton: RadioButton
    lateinit var weeklyButton: RadioButton
    lateinit var monthlyButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_self_care_item_activity)

    }
}