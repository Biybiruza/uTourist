package com.biybiruza.myapplication.ui.onboarding.screen

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.ThirdScreenBinding

class ThirdScreen : Fragment(R.layout.third_screen) {

    private lateinit var binding: ThirdScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ThirdScreenBinding.bind(view)

        binding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingFragment_to_signInFragment)
        }
    }

    private fun onBoardingFinished() {
        val sharedPreferences =
            requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("finished", true)
        editor.apply()
    }
}