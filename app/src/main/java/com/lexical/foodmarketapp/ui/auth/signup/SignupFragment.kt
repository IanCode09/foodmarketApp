package com.lexical.foodmarketapp.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.databinding.FragmentSignupBinding
import com.lexical.foodmarketapp.ui.auth.AuthActivity

class SignupFragment : Fragment() {

    private var _binding : FragmentSignupBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (activity as AuthActivity).toolbarSignUp()

        binding.btnContinue.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signup_address, null)

            (activity as AuthActivity).toolbarSignUpAddress()
        }
    }
}