package com.biybiruza.myapplication.ui.forgot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentVerificationEndBinding

class VerificationEndFragment : Fragment(R.layout.fragment_verification_end) {

    private lateinit var binding: FragmentVerificationEndBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVerificationEndBinding.bind(view)

        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.action_verificationEndFragment_to_mainFragment)
        }
    }
}