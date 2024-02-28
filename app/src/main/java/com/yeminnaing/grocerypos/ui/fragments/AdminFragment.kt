package com.yeminnaing.grocerypos.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.yeminnaing.grocerypos.R
import com.yeminnaing.grocerypos.databinding.FragmentAdminBinding

class AdminFragment : Fragment() {
    private lateinit var binding: FragmentAdminBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAdminBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpListener(view)
    }

    private fun setUpListener(view: View) {
        binding.btnDailyIncome.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_nav_admin_to_dailyIncomeFragment)
        }

        binding.btnWeeklyIncome.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_nav_admin_to_weeklyIncomeFragment)
        }
        binding.btnMonthlyIncome.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_nav_admin_to_monthlyIncomeFragment)
        }

        binding.btnAddItems.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_nav_admin_to_addItemsFragment)
        }
    }

}