package com.example.metro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MetroAdapter(context: Context, resource: Int, private val stations: MutableList<String>) : ArrayAdapter<String>(context, resource, stations) {
    override fun getCount(): Int {
        return stations.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent)
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val convertView = inflater.inflate(R.layout.item, parent, false)

        val station = stations[position]

        val s = convertView.findViewById(R.id.station) as TextView
        s.text = station

        return convertView
    }
}