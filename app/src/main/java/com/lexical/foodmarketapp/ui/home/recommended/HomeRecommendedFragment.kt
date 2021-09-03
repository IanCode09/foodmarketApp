package com.lexical.foodmarketapp.ui.home.recommended

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.databinding.FragmentHomeNewTasteBinding
import com.lexical.foodmarketapp.model.dummy.HomeVerticalModel
import com.lexical.foodmarketapp.ui.home.newtaste.HomeNewtasteAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeRecommendedFragment : Fragment(), HomeNewtasteAdapter.ItemAdapterCallback {

    private var _binding: FragmentHomeNewTasteBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var foodList: ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeNewTasteBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeNewtasteAdapter(foodList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)

        rcList.layoutManager = layoutManager
        rcList.adapter = adapter
    }

    fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Testing Food 1", "10000", "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=220&q=80", 5f, ))
        foodList.add(HomeVerticalModel("Testing Food 2", "5500", "https://images.unsplash.com/photo-1455619452474-d2be8b1e70cd?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80", 4f))
        foodList.add(HomeVerticalModel("Testing Food 3", "20000", "https://images.unsplash.com/photo-1490645935967-10de6ba17061?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=735&q=80",3f))
        foodList.add(HomeVerticalModel("Testing Food 4", "1000", "https://images.unsplash.com/photo-1432139555190-58524dae6a55?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=755&q=80",2f))
    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        Toast.makeText(context, "Klik Item " + data.title, Toast.LENGTH_SHORT).show()
    }
}