package com.example.pmdm_examenordinaria_davidjalon.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pmdm_examenordinaria_davidjalon.data.model.Pais
import com.squareup.picasso.Picasso

class PaisAdapter {
    private var paisList = listOf<Pais>()

    /**
     * Actualiza la lista de productos del adaptador y notifica los cambios para que se
     * actualice la UI.
     *
     * @param newList La nueva lista de productos a mostrar.
     */
    fun update(newList: List<Pais>) {
        paisList = newList
        notifyDataSetChanged()
    }

    /**
     * ViewHolder para cada elemento de la lista.
     * Contiene una referencia al binding del layout `item_product.xml`.
     *
     * @param binding El objeto de binding para el layout de un elemento.
     */
    class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    /**
     * Crea y devuelve un [ViewHolder] inflando el layout `item_product.xml`.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    /**
     * Vincula los datos de un producto en una posición específica con las vistas del [ViewHolder].
     *
     * @param holder El ViewHolder que debe ser actualizado.
     * @param position La posición del elemento en la lista.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = paisList[position]
        holder.binding.tvTitle.text = product.title
        Picasso.get().load(product.image).into(holder.binding.ivPais)
        holder.itemView.setOnClickListener { onClick(product.id) }
    }

    /**
     * Devuelve el número total de elementos en la lista.
     */
    override fun getItemCount() = paisList.size
}