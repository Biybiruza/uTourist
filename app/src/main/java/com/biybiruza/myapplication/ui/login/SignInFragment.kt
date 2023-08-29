package com.biybiruza.myapplication.ui.login

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentSignInBinding

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: Editor

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)

        sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        binding.btnLogin.setOnClickListener {
            if (binding.etEmail.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your Email", Toast.LENGTH_SHORT).show()
            } else if (binding.etPassword.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your Password", Toast.LENGTH_SHORT).show()
            } else if (binding.etPassword.text.toString().isEmpty() && binding.etEmail.text.toString().isEmpty()){
                Toast.makeText(requireActivity(), "Enter your Email and Password", Toast.LENGTH_SHORT).show()
            } else {
                if (sharedPreferences.getBoolean("isLoggedIn", false)){
                    findNavController().navigate(R.id.action_signInFragment_to_mainFragment)
                } else {
                    Toast.makeText(requireActivity(), "You are not registered. please register!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.tvForgotPass.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_forgotPasswordFragment)
        }

        binding.tvSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }

    }

}