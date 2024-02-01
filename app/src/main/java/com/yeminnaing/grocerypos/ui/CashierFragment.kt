package com.yeminnaing.grocerypos.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.yeminnaing.grocerypos.adapters.CategoryAdapter
import com.yeminnaing.grocerypos.adapters.ShowItemsForSaleAdapter
import com.yeminnaing.grocerypos.adapters.ShowStockAlertAdapter
import com.yeminnaing.grocerypos.databinding.FragmentCashierBinding

class CashierFragment : Fragment() {

    private lateinit var binding: FragmentCashierBinding
    private lateinit var mShowStockAlertAdapter: ShowStockAlertAdapter
    private lateinit var mCategoryAdapter: CategoryAdapter
    private lateinit var mShowItemsForSaleAdapter: ShowItemsForSaleAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCashierBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpShowStockView()
        setUpCategoryView()
        setUpShowItemsView()
    }

    private fun setUpShowItemsView() {
        mShowItemsForSaleAdapter= ShowItemsForSaleAdapter()
        binding.rvItemsForSale.also {
            it.adapter=mShowItemsForSaleAdapter
            it.layoutManager=LinearLayoutManager(this.context)
        }
    }

    private fun setUpCategoryView() {
        mCategoryAdapter = CategoryAdapter()
        binding.rvCategory.also {
            it.adapter = mCategoryAdapter
            it.layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        }

    }

    private fun setUpShowStockView() {
        mShowStockAlertAdapter = ShowStockAlertAdapter()
        binding.rvShowStockAlert.also {
            it.adapter = mShowStockAlertAdapter
            it.layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        }
    }


}