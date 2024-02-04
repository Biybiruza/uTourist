package com.biybiruza.myapplication.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.ItemSpinnerLocationBinding
import com.biybiruza.myapplication.ui.data.location.LocationsModel

class AdapterSpinnerLocation(val context: Context, private val list: List<LocationsModel>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View
        val vh: ItemHolder
        if (convertView == null) {
            view = inflater.inflate(R.layout.item_spinner_location, parent, false)
            vh = ItemHolder(view)
            view?.tag = vh
        } else {
            view = convertView
            vh = view.tag as ItemHolder
        }
        vh.label.text = list[position].nameLocation

        return view
    }

    class ItemHolder(itemView: View?) {

        val label: TextView

        init {
            label = itemView?.findViewById(R.id.tv_nameLocation) as TextView
        }
    }

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}