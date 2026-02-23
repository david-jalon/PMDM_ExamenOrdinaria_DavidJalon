package com.example.pmdm_examenordinaria_davidjalon.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pmdm_examenordinaria_davidjalon.data.model.Pais
import com.example.pmdm_examenordinaria_davidjalon.repository.PaisRepository
import kotlinx.coroutines.launch

class PaisViewModel : ViewModel() {
    private val repository = PaisRepository()


    val paisList = MutableLiveData<List<Pais>>()


    fun fetchEuropa(category: String) {
        viewModelScope.launch {
            val response = repository.getEuropa(category)
            paisList.postValue(response)
        }
    }

    fun fetchAmerica(category: String) {
        viewModelScope.launch {
            val response = repository.getAmerica(category)
            paisList.postValue(response)
        }
    }

    fun fetchAsia(category: String) {
        viewModelScope.launch {
            val response = repository.getAsia(category)
            paisList.postValue(response)
        }
    }

    fun fetchAfrica(category: String) {
        viewModelScope.launch {
            val response = repository.getAfrica(category)
            paisList.postValue(response)
        }
    }

    fun fetchOceania(category: String) {
        viewModelScope.launch {
            val response = repository.getOceania(category)
            paisList.postValue(response)
        }
    }

}