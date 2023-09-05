package com.biybiruza.myapplication.ui.languages

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentLanguageBinding
import java.util.Locale

class LanguageFragment : Fragment(R.layout.fragment_language){

    private lateinit var binding: FragmentLanguageBinding


    private var isChecked = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLanguageBinding.bind(view)

        binding.apply {
            cvEnglish.setOnClickListener {
                setLocate("en")

                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
            cvKarakalpak.setOnClickListener {
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
            cvRussian.setOnClickListener {
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
            cvUzbek.setOnClickListener {
                setLocate("uz")
                findNavController().navigate(R.id.action_languageFragment_to_onBoardingFragment)
            }
        }
    }
    private fun setLocate(s: String) {
        val locale = Locale(s)
        Locale.setDefault(locale)

        val configuration = Configuration()
        configuration.locale = locale

        requireActivity().baseContext.resources.updateConfiguration(configuration,requireActivity().baseContext.resources.displayMetrics)

        val editor = requireActivity().getSharedPreferences("settings", Context.MODE_PRIVATE).edit()
        editor.putString("my_language", s)
        editor.apply()

    }

    private fun loadLocate() {
        val sharedPreferences = requireActivity().getSharedPreferences("settings", Context.MODE_PRIVATE)
        val language = sharedPreferences.getString("my_language", "")
        if (language != null) {
            setLocate(language)
        }
    }
}