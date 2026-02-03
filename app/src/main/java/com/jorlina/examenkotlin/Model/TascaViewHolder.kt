package com.jorlina.examenkotlin.Model

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.jorlina.examenkotlin.R

class TascaViewHolder(itemView: View, private val onItemClick: (Tasca) -> Unit) : RecyclerView.ViewHolder(itemView) {

        private val tvNom: TextView = itemView.findViewById(R.id.tvNom)
        private val tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
        private val tvData: TextView = itemView.findViewById(R.id.tvData)
        private val tvEstat: TextView = itemView.findViewById(R.id.tvEstat)

        fun renderitza(item: Tasca){
            tvNom.text = item.nom
            tvCategoria.text = item.categoria as CharSequence?
            tvData.text = item.data
            tvEstat.text = item.estat as CharSequence?


            itemView.setOnClickListener {
                onItemClick(item)
            }
        }

}