package com.biybiruza.myapplication.ui.main_fragment

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: Editor

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        editor.putBoolean("finished", true)
        editor.putBoolean("isLoggedIn", true)
        editor.apply()

    }

}