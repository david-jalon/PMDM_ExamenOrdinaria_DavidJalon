package com.example.pmdm_examenordinaria_davidjalon.ui.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.pmdm_examenordinaria_davidjalon.R
import com.example.pmdm_examenordinaria_davidjalon.databinding.ActivityDetailBinding
import com.example.pmdm_examenordinaria_davidjalon.ui.viewmodel.PaisViewModel
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: PaisViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("PRODUCT_ID", 1)

        viewModel = ViewModelProvider(this).get(PaisViewModel::class.java)

        viewModel.paisDetail.observe(this) { pais ->
            binding.tvTitleDetail.text = pais.
            binding.tvDescDetail.text = pais.

            Picasso.get().load(pais.imagen).into(binding.ivDetail)
        }

        viewModel.fetchPais(id)
    }
}