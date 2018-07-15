package com.mobile.meredithbayne.myselfcare.ui.selfcarelist

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.meredithbayne.myselfcare.R

class SelfCareListFragment : Fragment() {

    companion object {
        fun newInstance() = SelfCareListFragment()
    }

    private lateinit var viewModel: SelfCareListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.self_care_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SelfCareListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
