package com.example.kotlinhomework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinhomework5.databinding.ActivityCarListBinding

class CarListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCarListBinding
    private val carsListAdapter = CarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillCarsList()
        setupRecyclerView()
    }

    private fun fillCarsList() {
        val carsList = listOf(
            Cars("Mazda", R.drawable.mazda, 4, 250),
            Cars("Bmw", R.drawable.bmw, 4, 290),
            Cars("Mers", R.drawable.mers, 4, 240),
            Cars("Toyota", R.drawable.toyota, 4, 230),
            Cars("Golf", R.drawable.golf, 4, 210),
            Cars("Ford", R.drawable.ford, 4, 300),
            Cars("Ferrari", R.drawable.ferrari, 4, 360),
            Cars("Fit", R.drawable.fit, 4, 400),
            Cars("Daewoo", R.drawable.daewoo, 4, 380),
            Cars("Bugatti", R.drawable.bugati, 4, 420),

            )
        carsListAdapter.setData(carsList)
    }

    private fun setupRecyclerView() {
        binding.rvCar.adapter = carsListAdapter
    }
}