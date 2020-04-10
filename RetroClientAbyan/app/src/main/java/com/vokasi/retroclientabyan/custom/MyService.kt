package com.vokasi.retroclientabyan.custom

import com.vokasi.retroclientabyan.model.MyModel
import retrofit2.Call
import retrofit2.http.GET

interface MyServices{
    @GET("posts")
    fun getPosts(): Call<List<MyModel>>
}