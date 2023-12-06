package com.example.kotlinhomework5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinhomework5.databinding.CarItemBinding

class CarListAdapter : RecyclerView.Adapter<CarListAdapter.CarViewHolder>() {
    private var cars = listOf<Cars>()
    fun setData(data: List<Cars>) {
        cars = data
    }

    class CarViewHolder(private val binding: CarItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(cars: Cars) = with(binding) {
            ivGaller.setImageResource(cars.carImage)
            tvText.text = cars.nameCar
            tvWheels.text = cars.wheels.toString()
            tvSpeed.text = cars.speed.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding = CarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(cars[position])
    }
}