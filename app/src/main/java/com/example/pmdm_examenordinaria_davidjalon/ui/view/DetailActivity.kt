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


        viewModel = ViewModelProvider(this).get(PaisViewModel::class.java)

        viewModel.paisList.observe(this) { pais ->
            binding.tvTitleDetail.text = pais.comun
            binding.tvCapital.text = pais.capital
            binding.tvPoblacion.text = pais.poblacion

            Picasso.get().load(pais.imagen).into(binding.ivDetail)
        }

    }
}