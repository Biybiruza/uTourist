package com.biybiruza.myapplication.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.ItemCitiesBinding
import com.biybiruza.myapplication.ui.data.CitiesModel

class AdapterHome(val list: List<CitiesModel>) : Adapter<AdapterHome.ItemViewHolder> () {

    private lateinit var binding: ItemCitiesBinding

    inner class ItemViewHolder(itemView: View): ViewHolder(itemView) {
        fun populateModel(model: CitiesModel) {
            binding = ItemCitiesBinding.bind(itemView)

            binding.ivCity.setImageResource(model.img)
            binding.tvName.text = model.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cities,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.populateModel(list[position])
    }
}