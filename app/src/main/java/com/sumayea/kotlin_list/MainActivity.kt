package com.sumayea.kotlin_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Title One", "Description One..", R.drawable.ic_android_black_24dp))
        list.add(Model("Title Two", "Description Two..", R.drawable.ic_android_black_24dp))
        list.add(Model("Title Three", "Description Three..", R.drawable.ic_android_black_24dp))
        list.add(Model("Title Four", "Description Four..", R.drawable.ic_android_black_24dp))
        list.add(Model("Title Five", "Description Five..", R.drawable.ic_android_black_24dp))
        list.add(Model("Title Six", "Description Six..", R.drawable.ic_android_black_24dp))

        listView.adapter = MyListAdapter(this,R.layout.row, list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if(position==0 ){
            Toast.makeText(this@MainActivity, "Item One Clicked..", Toast.LENGTH_SHORT).show()
            }

            if(position==1 ){
                Toast.makeText(this@MainActivity, "Item Two Clicked..", Toast.LENGTH_SHORT).show()
            }
            if(position==2 ){
                Toast.makeText(this@MainActivity, "Item Three Clicked..", Toast.LENGTH_SHORT).show()
            }
            if(position==3 ){
                Toast.makeText(this@MainActivity, "Item Four Clicked..", Toast.LENGTH_SHORT).show()
            }
            if(position==4 ){
                Toast.makeText(this@MainActivity, "Item Five Clicked..", Toast.LENGTH_SHORT).show()
            }
            if(position==5 ){
                Toast.makeText(this@MainActivity, "Item Six Clicked..", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
