package com.biybiruza.myapplication.ui.forgot

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentForgotPasswordNextBinding

class ForgotPasswordNextFragment : Fragment(R.layout.fragment_forgot_password_next) {

    private lateinit var binding: FragmentForgotPasswordNextBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForgotPasswordNextBinding.bind(view)

        binding.btnVerif.setOnClickListener {
            findNavController().navigate(R.id.action_forgotPasswordNextFragment_to_verificationFragment)
        }
    }
}