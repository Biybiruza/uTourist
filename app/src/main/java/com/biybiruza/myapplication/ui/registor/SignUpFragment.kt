package com.biybiruza.myapplication.ui.registor

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignUpBinding.bind(view)

        binding.btnContinue.setOnClickListener {
            if (binding.etFistName.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your first name", Toast.LENGTH_SHORT).show()
            } else if (binding.etLastName.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your last name", Toast.LENGTH_SHORT).show()
            } else if (binding.etEmail.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your Email", Toast.LENGTH_SHORT).show()
            } else if (binding.etPassword.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your Password", Toast.LENGTH_SHORT).show()
            } else if (binding.etFistName.text.toString().isEmpty() && binding.etLastName.text.toString().isEmpty()
                && binding.etPassword.text.toString().isEmpty() && binding.etEmail.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Fill in the fields, Please", Toast.LENGTH_SHORT).show()
            } else {
                findNavController().navigate(R.id.action_signUpFragment_to_mainFragment)
            }
        }

        binding.ivBackBtn.setOnClickListener {
            requireActivity().onBackPressed()
        }

        binding.tvLogin.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }
    }

}