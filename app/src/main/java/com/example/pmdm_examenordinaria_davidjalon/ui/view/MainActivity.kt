package com.example.pmdm_examenordinaria_davidjalon.ui.view

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pmdm_examenordinaria_davidjalon.R
import com.example.pmdm_examenordinaria_davidjalon.databinding.ActivityMainBinding
import com.example.pmdm_examenordinaria_davidjalon.ui.adapter.PaisAdapter
import com.example.pmdm_examenordinaria_davidjalon.ui.viewmodel.PaisViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: PaisViewModel
    private lateinit var adapter: PaisAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        adapter = PaisAdapter
        binding.rvPaises.layoutManager = LinearLayoutManager(this)
        binding.rvPaises.adapter = adapter

        viewModel = ViewModelProvider(this).get(PaisViewModel::class.java)
        viewModel.paisList.observe(this) { adapter.update(it) }


        viewModel.fetchEuropa("Europa")
    }

    // Inflar el menú en la Toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Lógica al pulsar una opción del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_europa -> viewModel.fetchEuropa("Europa")
            R.id.menu_america -> viewModel.fetchAmerica("America")
            R.id.menu_asia -> viewModel.fetchAsia("Asia")
            R.id.menu_africa -> viewModel.fetchAfrica("Africa")
            R.id.menu_oceania -> viewModel.fetchOceania("Oceania")
        }
        return super.onOptionsItemSelected(item)
    }
}