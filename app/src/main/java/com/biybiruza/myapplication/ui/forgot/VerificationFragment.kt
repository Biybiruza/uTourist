package com.biybiruza.myapplication.ui.forgot

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentVerificationBinding

class VerificationFragment : Fragment(R.layout.fragment_verification) {

    private lateinit var binding: FragmentVerificationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVerificationBinding.bind(view)

        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.action_verificationFragment_to_verificationNextFragment3)
        }
    }
}