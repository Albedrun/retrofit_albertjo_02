package com.example.retrofit_albertjo_02.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode_Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive: Int,
    @SerializedName("Kasus_Semb")
    val recover: Int,
    @SerializedName("Kasus_Meni")
    val death: Int
)

//"attributes": {
//            "FID": 11,
//            "Kode_Provi":31,
//            "Provinsi":"DKI Jakarta",
//            "Kasus_Posi": 8355,
//            "Kasus_Semb": 3371,
//            "Kasus_Meni": 533
//        }