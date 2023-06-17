package com.blihm.balihometest.data.network.api

import com.blihm.balihometest.data.network.model.UserDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UsersApi {

    @GET("users")
    suspend fun getUsers(
        @Query("since") since: Int = 0,
        @Query("per_page") perPage: Int
    ): List<UserDto>

    @GET("users/{id}")
    suspend fun getUserById(@Path("id") userId: Int)
}