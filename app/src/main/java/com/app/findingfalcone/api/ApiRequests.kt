package com.app.findingfalcone.api

import com.app.findingfalcone.models.Planets
import com.app.findingfalcone.models.RequestBody
import com.app.findingfalcone.models.Result
import com.app.findingfalcone.models.Token
import com.app.findingfalcone.models.Vehicles
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiRequests {
    @GET("planets")
    suspend fun getPlanets(): List<Planets>

    @GET("vehicles")
    suspend fun getVehicles(): List<Vehicles>

    @Headers("Accept: application/json")
    @POST("token")
    suspend fun getToken(): Token

    @Headers("Accept: application/json", "Content-Type: application/json")
    @POST("find")
    suspend fun findFalcon(@Body requestBody: RequestBody): Result
}