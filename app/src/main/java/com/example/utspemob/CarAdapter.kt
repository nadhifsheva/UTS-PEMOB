package com.example.utspemob

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val context: Context, private val carList: List<Car>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMotor: ImageView = itemView.findViewById(R.id.imgMotor)
        val txtMotorName: TextView = itemView.findViewById(R.id.txtMotorName)
        val txtMotorGenre: TextView = itemView.findViewById(R.id.txtMotorGenre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_motor, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = carList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val motor = carList[position]
        holder.imgMotor.setImageResource(motor.imageResId)
        holder.txtMotorName.text = motor.name
        holder.txtMotorGenre.text = motor.genres
    }
}
