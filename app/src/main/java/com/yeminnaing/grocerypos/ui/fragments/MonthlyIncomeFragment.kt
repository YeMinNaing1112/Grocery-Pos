package com.yeminnaing.grocerypos.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yeminnaing.grocerypos.databinding.FragmentMontlyIncomeBinding


class MonthlyIncomeFragment : Fragment() {

    private lateinit var binding: FragmentMontlyIncomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMontlyIncomeBinding.inflate(inflater, container, false)
        return binding.root
    }


}