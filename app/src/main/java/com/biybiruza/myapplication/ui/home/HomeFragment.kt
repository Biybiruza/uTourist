package com.biybiruza.myapplication.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.biybiruza.myapplication.R
import com.biybiruza.myapplication.databinding.FragmentHomeBinding
import com.biybiruza.myapplication.ui.data.CitiesModel
import com.biybiruza.myapplication.ui.data.location.LocationsModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private val listCities = arrayListOf<CitiesModel>()
    private lateinit var adapterHome: AdapterHome

    private val locations = arrayListOf<LocationsModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        val adapterSpinner = AdapterSpinnerLocation(requireActivity(), loadSpinnerLocation())
        binding.spinner.adapter = adapterSpinner

        adapterHome = AdapterHome(loadData())


        val layuatManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)
        binding.rvCities.layoutManager = layuatManager
        binding.rvCities.adapter = adapterHome

    }

    private fun loadSpinnerLocation() : List<LocationsModel> {
        locations.add(LocationsModel("Nukus city"))
        locations.add(LocationsModel("Nukus region"))
        locations.add(LocationsModel("Khodzhelyli region"))
        locations.add(LocationsModel("Moynak region"))
        locations.add(LocationsModel("To'rt ko'l region"))
        locations.add(LocationsModel("Shimbay city"))
        return locations
    }

    private fun loadData(): List<CitiesModel> {
        listCities.add(CitiesModel("All",R.drawable.item_city))
        listCities.add(CitiesModel("Nukus city",R.drawable.nukus))
        listCities.add(CitiesModel("Moynak region",R.drawable.moynak))
        listCities.add(CitiesModel("Khodzhelyli region",R.drawable.khodzhelyli))
        return listCities
    }
}