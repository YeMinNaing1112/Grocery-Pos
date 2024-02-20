package com.yeminnaing.grocerypos.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yeminnaing.grocerypos.databinding.ItemsDailyIncomeBinding

class ShowItemsDailyIncomeAdapter :
    RecyclerView.Adapter<ShowItemsDailyIncomeAdapter.ShowItemsIncomeViewHolder>() {
    class ShowItemsIncomeViewHolder(val binding: ItemsDailyIncomeBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowItemsIncomeViewHolder {
        val view =
            ItemsDailyIncomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowItemsIncomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ShowItemsIncomeViewHolder, position: Int) {

    }
}