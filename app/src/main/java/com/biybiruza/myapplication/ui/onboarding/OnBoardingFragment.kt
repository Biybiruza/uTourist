package com.biybiruza.myapplication.ui.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentOnBoardingBinding
import com.biybiruza.myapplication.ui.onboarding.screen.FirstScreen
import com.biybiruza.myapplication.ui.onboarding.screen.SecondScreen
import com.biybiruza.myapplication.ui.onboarding.screen.ThirdScreen

class OnBoardingFragment : Fragment(R.layout.fragment_on_boarding) {

    private lateinit var adapter: ViewPagerAdapter
    private lateinit var binding: FragmentOnBoardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnBoardingBinding.bind(view)


        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager,lifecycle)

        binding.vpViewPager.adapter = adapter
        binding.dotsIndicator.attachTo(binding.vpViewPager)
    }

}