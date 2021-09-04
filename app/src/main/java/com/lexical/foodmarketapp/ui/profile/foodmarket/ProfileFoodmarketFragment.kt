package com.lexical.foodmarketapp.ui.profile.foodmarket

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
import com.lexical.foodmarketapp.databinding.FragmentProfileFoodmarketBinding
import com.lexical.foodmarketapp.model.dummy.ProfileMenuModel
import com.lexical.foodmarketapp.ui.profile.ProfileMenuAdapter
import kotlinx.android.synthetic.main.fragment_profile_account.*

class ProfileFoodmarketFragment : Fragment(), ProfileMenuAdapter.ItemAdapterCallback {

    private var _binding: FragmentProfileFoodmarketBinding? = null
    private val binding get() = _binding!!

    private var menuArrayList: ArrayList<ProfileMenuModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileFoodmarketBinding.inflate(inflater, container, false)
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
        menuArrayList.add(ProfileMenuModel("Rate Apps"))
        menuArrayList.add(ProfileMenuModel("Help Center"))
        menuArrayList.add(ProfileMenuModel("Privacy & Policy}"))
        menuArrayList.add(ProfileMenuModel("Term & Conditions"))
    }

    override fun onClick(v: View, data: ProfileMenuModel) {
        Toast.makeText(context, "Menu klik " + data.title, Toast.LENGTH_SHORT).show()
    }
}