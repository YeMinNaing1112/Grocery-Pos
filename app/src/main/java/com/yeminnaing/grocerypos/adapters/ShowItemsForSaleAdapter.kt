package com.yeminnaing.grocerypos.adapters

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.yeminnaing.grocerypos.R
import com.yeminnaing.grocerypos.databinding.ItemForSaleBinding

class ShowItemsForSaleAdapter : RecyclerView.Adapter<ShowItemsForSaleAdapter.ShowItemViewHolder>() {
    class ShowItemViewHolder(val binding: ItemForSaleBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowItemViewHolder {
        val view = ItemForSaleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ShowItemViewHolder, position: Int) {
        holder.binding.rlItemForSale.setOnClickListener {
            holder.binding.llShowAmount.isVisible = true
            holder.binding.llNameAndPrice.isVisible = true
            holder.binding.tvItemName.isVisible = false
            holder.binding.tvItemPrice.isVisible = false
            holder.binding.rlItemForSale.setBackgroundResource(R.drawable.item_for_sale_selected_bg)
        }
    }
}