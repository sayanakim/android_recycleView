package com.sayana.r_l_view_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var userRecyclerView: RecyclerView
    lateinit var cityRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userList:List<User> = listOf(
//            User("Ivan", 20),
//            User("Elena", 19),
//            User("Maxim", 35),
//            User("Natali", 32)
//        )

//        userRecyclerView = findViewById(R.id.user_recycler_view)
//        userRecyclerView.layoutManager =
//            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//
//        userRecyclerView.adapter = UserAdapter(userList)
//        userRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        val cityList:List<City> = listOf(
            City("Moscow", 5000000),
            City("Irkutsk", 2000000),
            City("Novosibirsk", 3000000),
            City("Chita", 400000)
        )

        cityRecyclerView = findViewById(R.id.user_recycler_view)

        cityRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        cityRecyclerView.adapter = CityAdapter(cityList)
        cityRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))


    }
}


// RecyclerView <- Adapter <- ViewHolder <- Layout
// 1. layoutManager
// 2. Adapter

// RecyclerView + 1
// Adapter +4
// ViewHolder +3
// Layout + 2