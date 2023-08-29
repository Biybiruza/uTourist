package com.biybiruza.myapplication.ui.forgot

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment(R.layout.fragment_forgot_password) {

    private lateinit var binding: FragmentForgotPasswordBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForgotPasswordBinding.bind(view)

        binding.btnSubmit.setOnClickListener {
            if (binding.rbCheck.isChecked && binding.rbCheck2.isChecked){
                findNavController().navigate(R.id.action_forgotPasswordFragment_to_forgotPasswordNextFragment)
            } else {
                Toast.makeText(requireActivity(),"select item, please", Toast.LENGTH_LONG).show()
            }
        }
    }

}