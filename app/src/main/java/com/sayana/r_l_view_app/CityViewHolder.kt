package com.sayana.r_l_view_app

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val cityTextView: TextView = itemView.findViewById(R.id.city_text_view)
    private val populTextView: TextView = itemView.findViewById(R.id.popul_text_view)

    fun bind(city: City) {

        cityTextView.text = "Город: ${city.name}"
        populTextView.text = "Численность: ${city.population} человек"

        // всплывающее окно при клике на имя
        itemView.setOnClickListener {
            Toast.makeText(itemView.context, city.name, Toast.LENGTH_LONG).show()
        }
    }



}
