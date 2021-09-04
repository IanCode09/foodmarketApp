package com.lexical.foodmarketapp.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lexical.foodmarketapp.databinding.FragmentProfileBinding
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val sectionPagerAdapter = SectionPagerAdapter(
            childFragmentManager
        )

        viewPager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
