package com.mobile.meredithbayne.myselfcare.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mobile.meredithbayne.myselfcare.R
import com.mobile.meredithbayne.myselfcare.persistence.SelfCareItem

class SelfCareItemAdapter(items: List<SelfCareItem>, listener: OnItemClickListener)
    : RecyclerView.Adapter<SelfCareItemAdapter.SelfCareViewHolder>() {

    private var selfCareItems: List<SelfCareItem> = items
    private var selfCareListener: OnItemClickListener = listener

    interface OnItemClickListener {
        fun onItemClick(selfCareItem: SelfCareItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelfCareViewHolder {
        return SelfCareViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.self_care_item, parent, false))
    }

    override fun getItemCount(): Int {
        return selfCareItems.size
    }

    override fun onBindViewHolder(holder: SelfCareViewHolder, position: Int) {
        val currentItem: SelfCareItem = selfCareItems[position]

        val description = currentItem.description
        val frequency = currentItem.frequency
        val category = currentItem.category

        holder.description.text = description
        holder.frequency.text = frequency
        holder.category.text = category

        holder.bind(currentItem, selfCareListener)
    }

    class SelfCareViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var description = itemView.findViewById<TextView>(R.id.item_name)!!
        var frequency = itemView.findViewById<TextView>(R.id.frequency_description)!!
        var category = itemView.findViewById<TextView>(R.id.category_description)!!

        fun bind(selfCareItem: SelfCareItem, listener: OnItemClickListener) {
            itemView.setOnClickListener {
                listener.onItemClick(selfCareItem)
            }
        }
    }
}