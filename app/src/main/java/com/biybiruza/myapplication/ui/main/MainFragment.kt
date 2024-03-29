package com.biybiruza.myapplication.ui.main

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: Editor
    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        navController = Navigation.findNavController(requireActivity(),R.id.fm_mainFragment)

        binding.apply {
            bottomNav.setupWithNavController(navController)
        }

        editor.putBoolean("finished", true)
        editor.putBoolean("isLoggedIn", true)
        editor.apply()

    }

}