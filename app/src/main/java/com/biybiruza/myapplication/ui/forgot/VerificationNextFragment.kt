package com.biybiruza.myapplication.ui.forgot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentVerificationNextBinding

class VerificationNextFragment : Fragment(R.layout.fragment_verification_next) {

    private lateinit var binding: FragmentVerificationNextBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVerificationNextBinding.bind(view)

        binding.btnVerification.setOnClickListener {
            findNavController().navigate(R.id.action_verificationNextFragment_to_verificationEndFragment)
        }
    }
}