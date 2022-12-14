package com.example.apijson_loginregister.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("mfriend_login")
    fun login(
        @Field("phone") phone: String?,
        @Field("password") password: String?
    ): String
}