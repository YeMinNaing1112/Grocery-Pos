package com.yeminnaing.grocerypos.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yeminnaing.grocerypos.databinding.ItemStockAlertBinding


class ShowStockAlertAdapter :
    RecyclerView.Adapter<ShowStockAlertAdapter.ShowStockAlertViewHolder>() {
    class ShowStockAlertViewHolder(val binding: ItemStockAlertBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowStockAlertViewHolder {
        val view =
            ItemStockAlertBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowStockAlertViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ShowStockAlertViewHolder, position: Int) {

    }


}

