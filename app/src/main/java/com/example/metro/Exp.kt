//package com.example.student.metro
//
//import android.os.Bundle
//import android.widget.ListView
//import androidx.appcompat.app.AppCompatActivity
//import com.example.metro.R
//
//class MainActivity : AppCompatActivity() {
//    private var list: ListView? = null
//    private val stations: MutableList<String> = ArrayList()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        list = findViewById(R.id.list)
//        stations.add("Пролетарская")
//        stations.add("Китай-город")
//        stations.add("Кузнецкий мост")
//        stations.add("Смоленская")
//        stations.add("Киевская")
//        stations.add("Таганская")
//        stations.add("Студенческая")
//        stations.add("Римская")
//        stations.add("Комсомольская")
//        stations.add("Рижская")
//        val adapter = MetroAdapter(this, R.layout.item, stations)
//        list.setAdapter(adapter)
//    }
//}

package com.example.student.metro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.Nullable
import com.example.metro.R

class MetroAdapter(context: Context, resource: Int, private val stations: List<String>) :
    ArrayAdapter<String?>(context, resource) {
    override fun getCount(): Int {
        return stations.size
    }

    override fun getView(position: Int, @Nullable convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        convertView = inflater.inflate(R.layout.item, parent, false)
        val station = stations[position]
        val s = convertView!!.findViewById<TextView>(R.id.station)
        s.text = station
        return convertView
    }
}