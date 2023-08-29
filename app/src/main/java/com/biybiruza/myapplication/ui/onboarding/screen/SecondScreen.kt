package com.biybiruza.myapplication.ui.onboarding.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.SecondScreenBinding

class SecondScreen() : Fragment(R.layout.second_screen){

    private lateinit var binding: SecondScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SecondScreenBinding.bind(view)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.vp_viewPager)

        binding.btnNext.setOnClickListener {
            viewPager?.currentItem = 2
        }
    }
}