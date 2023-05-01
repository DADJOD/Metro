package com.example.metro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
     lateinit var list: ListView
     private var stations: MutableList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.list)

        stations.add("Пролетарская")
        stations.add("Китай-город")
        stations.add("Кузнецкий мост")
        stations.add("Смоленская")
        stations.add("Киевская")
        stations.add("Таганская")
        stations.add("Студенческая")
        stations.add("Римская")
        stations.add("Комсомольская")
        stations.add("Рижская")
        stations.add("Пролетарская")
        stations.add("Китай-город")
        stations.add("Кузнецкий мост")
        stations.add("Смоленская")
        stations.add("Киевская")
        stations.add("Таганская")
        stations.add("Студенческая")
        stations.add("Римская")
        stations.add("Комсомольская")
        stations.add("Рижская")

        val adapter = MetroAdapter(this, R.layout.item, stations)
        list.adapter = adapter
    }
}