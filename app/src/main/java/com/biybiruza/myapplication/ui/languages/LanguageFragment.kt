package com.biybiruza.myapplication.ui.languages

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentLanguageBinding

class LanguageFragment : Fragment(R.layout.fragment_language) {

    private lateinit var binding: FragmentLanguageBinding

    private var isChecked = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLanguageBinding.bind(view)

        binding.apply {
            cvEnglish.setOnClickListener {
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
            cvKarakalpak.setOnClickListener {
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
            cvRussian.setOnClickListener {
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
            cvUzbek.setOnClickListener {
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
        }
    }
}