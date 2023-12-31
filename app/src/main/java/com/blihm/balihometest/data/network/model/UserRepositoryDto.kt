package com.blihm.balihometest.data.network.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class UserRepositoryDto(
    val id: Int,
    val name: String,

    @SerializedName("owner")
    val owner: UserDto,

    @SerializedName("full_name")
    val fullName: String,
    val private: Boolean,
    val description: String?,
    val fork: Boolean,

    @SerializedName("created_at")
    val createdAt: Date,

    @SerializedName("updated_at")
    val updatedAt: Date,

    @SerializedName("git_url")
    val gitUrl: String,

    @SerializedName("ssh_url")
    val sshUrl: String,

    @SerializedName("clone_url")
    val cloneUrl: String,

    @SerializedName("stargazers_count")
    val stargazersCount: Int,

    @SerializedName("watchers_count")
    val watchersCount: Int,

    @SerializedName("forks_count")
    val forksCount: Int,
    val visibility: String
)


