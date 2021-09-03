package com.lexical.foodmarketapp.ui.home.newtaste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.model.dummy.HomeVerticalModel
import com.lexical.foodmarketapp.utils.Helpers.formatPrice
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_home.view.tvTitle
import kotlinx.android.synthetic.main.item_home_horizontal.view.*
import kotlinx.android.synthetic.main.item_home_horizontal.view.ivPoster
import kotlinx.android.synthetic.main.item_home_horizontal.view.rbFood
import kotlinx.android.synthetic.main.item_home_vertical.view.*

class HomeNewtasteAdapter (
        private val listData: List<HomeVerticalModel>,
        private val itemAdapterCallback: ItemAdapterCallback
    ) : RecyclerView.Adapter<HomeNewtasteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeNewtasteAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_vertical, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: HomeVerticalModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvTitle.text = data.title
                tvPrice.formatPrice(data.price.toString())
                rbFood.rating = data.rating

                Glide.with(context).load(data.src).into(ivPoster)

                itemView.setOnClickListener {
                    itemAdapterCallback.onClick(it, data)
                }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data: HomeVerticalModel)
    }
}