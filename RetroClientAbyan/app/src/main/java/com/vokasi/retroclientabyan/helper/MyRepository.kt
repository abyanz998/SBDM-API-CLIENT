package com.vokasi.retroclientabyan.helper

import com.vokasi.retroclientabyan.custom.MyServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MyRepository {
    fun create(): MyServices{
        val retro = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build()

        return retro.create(MyServices::class.java)
    }
}