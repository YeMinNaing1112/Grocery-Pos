package com.yeminnaing.grocerypos.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.yeminnaing.grocerypos.adapters.ShowItemsMonthlyIncomeAdapter
import com.yeminnaing.grocerypos.databinding.FragmentMontlyIncomeBinding


class MonthlyIncomeFragment : Fragment() {

    private lateinit var binding: FragmentMontlyIncomeBinding
    private lateinit var adapter: ShowItemsMonthlyIncomeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMontlyIncomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "MonthlyIncome"

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        adapter = ShowItemsMonthlyIncomeAdapter()
        binding.rvShowMostAndLeastSellingItems.also {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }

}