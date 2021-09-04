package com.lexical.foodmarketapp.ui.profile.account

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.databinding.FragmentProfileAccountBinding
import com.lexical.foodmarketapp.model.dummy.ProfileMenuModel
import com.lexical.foodmarketapp.ui.home.HomeAdapter
import com.lexical.foodmarketapp.ui.profile.ProfileMenuAdapter
import kotlinx.android.synthetic.main.fragment_profile_account.*

class ProfileAccountFragment : Fragment(), ProfileMenuAdapter.ItemAdapterCallback {

    private var _binding: FragmentProfileAccountBinding? = null
    private val binding get() = _binding!!

    private var menuArrayList: ArrayList<ProfileMenuModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileAccountBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDummy()

        var adapter = ProfileMenuAdapter(menuArrayList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter
    }

    fun initDummy() {
        menuArrayList = ArrayList()
        menuArrayList.add(ProfileMenuModel("Edit Profile"))
        menuArrayList.add(ProfileMenuModel("Home Address"))
        menuArrayList.add(ProfileMenuModel("Security"))
        menuArrayList.add(ProfileMenuModel("Payments"))
    }

    override fun onClick(v: View, data: ProfileMenuModel) {
        Toast.makeText(context, "Menu klik " + data.title, Toast.LENGTH_SHORT).show()
    }
}