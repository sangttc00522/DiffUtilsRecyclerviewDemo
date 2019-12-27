package com.tech.diffutilsrecyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tech.diffutilsrecyclerviewdemo.Adapter.MyRecyclerViewAdapter
import com.tech.diffutilsrecyclerviewdemo.DataFactory.DataGenerator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var adapter = MyRecyclerViewAdapter(DataGenerator.getData())
        rv_main.adapter = adapter
        swipeRefreshLayout.setOnRefreshListener {
            adapter.onNewData(DataGenerator.getUpdatedData())
            swipeRefreshLayout.isRefreshing = false
        }

    }

}
