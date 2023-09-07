package com.app.findingfalcone.repo

import com.app.findingfalcone.api.ApiClient
import com.app.findingfalcone.models.Planets
import com.app.findingfalcone.models.RequestBody
import com.app.findingfalcone.models.Result
import com.app.findingfalcone.models.Token
import com.app.findingfalcone.models.Vehicles

class Repository {

    suspend fun getPlanets(): List<Planets> {
        return ApiClient.api.getPlanets()
    }

    suspend fun getVehicles(): List<Vehicles> {
        return ApiClient.api.getVehicles()
    }

    suspend fun getToken(): Token {
        return ApiClient.api.getToken()
    }

    suspend fun getFalconResult(requestBody: RequestBody): Result {
        return ApiClient.api.findFalcon(requestBody)
    }
}