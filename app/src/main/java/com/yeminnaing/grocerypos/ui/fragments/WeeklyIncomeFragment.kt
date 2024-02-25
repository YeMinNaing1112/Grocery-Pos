package com.yeminnaing.grocerypos.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.yeminnaing.grocerypos.adapters.ShowItemsDailyIncomeAdapter
import com.yeminnaing.grocerypos.databinding.FragmentWeeklyIncomeBinding

class WeeklyIncomeFragment : Fragment() {
    private lateinit var binding: FragmentWeeklyIncomeBinding
    private lateinit var adapter:ShowItemsDailyIncomeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWeeklyIncomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title="WeeklyIncome"
       setUpRecyclerView()

    }

    private fun setUpRecyclerView() {
        adapter= ShowItemsDailyIncomeAdapter()
        binding.rvWeeklyIncomeShowAllItems.also {
            it.adapter=adapter
            it.layoutManager=LinearLayoutManager(context)
        }
    }
}