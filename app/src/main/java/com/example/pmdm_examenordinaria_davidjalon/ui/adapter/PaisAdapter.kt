package com.example.pmdm_examenordinaria_davidjalon.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pmdm_examenordinaria_davidjalon.data.model.Pais
import com.squareup.picasso.Picasso

class PaisAdapter {
    private var paisList = listOf<Pais>()

    fun update(newList: List<Pais>) {
        paisList = newList
    }


    class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = paisList[position]
        holder.binding.tvTitle.text = pais.title
        Picasso.get().load(pais.imagen).into(holder.binding.ivPais)
        holder.itemView.setOnClickListener { onClick(product.id) }
    }


    override fun getItemCount() = paisList.size
}