package com.yeminnaing.grocerypos.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.yeminnaing.grocerypos.adapters.CategoryAdapter
import com.yeminnaing.grocerypos.adapters.ShowItemStockAdapter
import com.yeminnaing.grocerypos.databinding.FragmentAddItemsBinding

class AddItemsFragment : Fragment() {
    private lateinit var binding: FragmentAddItemsBinding
    private lateinit var mCategoryAdapter: CategoryAdapter
    private lateinit var mShowStockAdapter: ShowItemStockAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddItemsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Add Items"
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        mCategoryAdapter = CategoryAdapter()
        binding.rvCategory.also {
            it.adapter = mCategoryAdapter
            it.layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        }

        mShowStockAdapter = ShowItemStockAdapter()
        binding.rvShowStock.also {
            it.adapter = mShowStockAdapter
            it.layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
    }

}