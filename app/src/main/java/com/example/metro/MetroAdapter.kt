package com.example.metro

import android.content.Context
import android.widget.ArrayAdapter

class MetroAdapter(context: Context, resource: Int, private val stations: MutableList<String>) : ArrayAdapter<String>(context, resource, stations) {

    override fun getCount(): Int {
        return stations.size
    }

    
}