package com.yeminnaing.grocerypos.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.yeminnaing.grocerypos.adapters.ShowItemsForSaleAdapter
import com.yeminnaing.grocerypos.databinding.FragmentCheckOutItemsBinding

class CheckOutItemsFragment : Fragment() {
    private lateinit var binding: FragmentCheckOutItemsBinding
    private lateinit var mShowItemsForSaleAdapter: ShowItemsForSaleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCheckOutItemsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "CheckOut"

        setUpSelectedItemsView()
    }

    private fun setUpSelectedItemsView() {
        mShowItemsForSaleAdapter = ShowItemsForSaleAdapter()
        binding.rvItemsSelected.also {
            it.adapter = mShowItemsForSaleAdapter
            it.layoutManager = LinearLayoutManager(this.context)
        }
    }

}