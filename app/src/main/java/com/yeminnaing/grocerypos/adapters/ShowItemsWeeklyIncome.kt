package com.yeminnaing.grocerypos.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yeminnaing.grocerypos.databinding.ItemWeeklyIncomeBinding

class ShowItemsWeeklyIncome :
    RecyclerView.Adapter<ShowItemsWeeklyIncome.ShowItemsWeeklyIncomeViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShowItemsWeeklyIncomeViewHolder {
        val view =
            ItemWeeklyIncomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ShowItemsWeeklyIncomeViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ShowItemsWeeklyIncomeViewHolder, position: Int) {

    }

    class ShowItemsWeeklyIncomeViewHolder(val binding: ItemWeeklyIncomeBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}