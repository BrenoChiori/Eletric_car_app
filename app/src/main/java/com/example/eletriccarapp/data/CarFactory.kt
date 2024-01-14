package com.example.eletriccarapp.data

import com.example.eletriccarapp.domain.Carro

object CarFactory {
    val list = listOf(
        Carro(
            id = 1,
            preco = "R$300.000",
            bateria = "300 kWh",
            potencia = "220cv",
            recarga = "30min",
            urlPhoto = "www.google.com",
            isFavorite = false
        ),
        Carro(
            id = 3,
            preco = "R$200.000",
            bateria = "200 kWh",
            potencia = "150cv",
            recarga = "40min",
            urlPhoto = "www.google.com",
            isFavorite = false
        )
    )
}