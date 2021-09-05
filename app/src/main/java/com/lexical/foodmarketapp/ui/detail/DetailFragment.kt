package com.lexical.foodmarketapp.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.databinding.FragmentDetailBinding
import com.lexical.foodmarketapp.databinding.FragmentProfileBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


}