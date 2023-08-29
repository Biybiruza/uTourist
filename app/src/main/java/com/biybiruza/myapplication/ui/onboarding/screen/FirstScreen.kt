package com.biybiruza.myapplication.ui.onboarding.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FisrtScreenBinding

class FirstScreen : Fragment(R.layout.fisrt_screen) {

    private lateinit var binding: FisrtScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FisrtScreenBinding.bind(view)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.vp_viewPager)

        binding.btnNext.setOnClickListener {
            viewPager?.currentItem = 1
        }
    }
}