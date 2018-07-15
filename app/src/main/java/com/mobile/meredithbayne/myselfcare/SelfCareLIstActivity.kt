package com.mobile.meredithbayne.myselfcare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mobile.meredithbayne.myselfcare.ui.selfcarelist.SelfCareListFragment

class SelfCareLIstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.self_care_list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SelfCareListFragment.newInstance())
                    .commitNow()
        }
    }

}
