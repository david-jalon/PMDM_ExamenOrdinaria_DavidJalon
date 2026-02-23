package com.example.pmdm_examenordinaria_davidjalon.data.model

import com.google.gson.annotations.SerializedName

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Pais(
    @SerializedName("translations") val traducciones: Translations?,
    @SerializedName("capital") val capital: List<String>?,
    @SerializedName("latlng") val latlng: List<Double>?,
    @SerializedName("borders") val fronteras: List<String>?,
    @SerializedName("flags") val bandera: Flag,
    @SerializedName("population") val poblacion: Int
): Parcelable
@Parcelize
data class Translations(@SerializedName("spa") val espanol: SpanishName?):
    Parcelable
@Parcelize
data class SpanishName(@SerializedName("common") val comun: String?): Parcelable
@Parcelize
data class Flag(@SerializedName("png") val imagen: String?): Parcelable