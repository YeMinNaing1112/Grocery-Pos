package com.yeminnaing.grocerypos.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yeminnaing.grocerypos.databinding.ItemsShowStrockBinding

class ShowItemStockAdapter : RecyclerView.Adapter<ShowItemStockAdapter.ShowItemStockViewHolder>() {
    class ShowItemStockViewHolder(binding: ItemsShowStrockBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowItemStockViewHolder {
        val view =
            ItemsShowStrockBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowItemStockViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: ShowItemStockViewHolder, position: Int) {

    }
}