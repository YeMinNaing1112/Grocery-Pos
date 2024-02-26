package com.yeminnaing.grocerypos.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yeminnaing.grocerypos.databinding.ItemsMontlyIncomeBinding

class ShowItemsMonthlyIncomeAdapter :
    RecyclerView.Adapter<ShowItemsMonthlyIncomeAdapter.ShowItemsMonthlyIncomeViewHolder>() {
    class ShowItemsMonthlyIncomeViewHolder(binding: ItemsMontlyIncomeBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShowItemsMonthlyIncomeViewHolder {
        val view =
            ItemsMontlyIncomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowItemsMonthlyIncomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ShowItemsMonthlyIncomeViewHolder, position: Int) {

    }

}
