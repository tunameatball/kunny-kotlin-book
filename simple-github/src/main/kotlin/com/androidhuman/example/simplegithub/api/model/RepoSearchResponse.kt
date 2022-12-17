package com.androidhuman.example.simplegithub.api.model

import com.androidhuman.example.simplegithub.api.model.GithubRepo
import com.google.gson.annotations.SerializedName

class RepoSearchResponse(
    @field:SerializedName("total_count") val totalCount: Int,
    val items: List<GithubRepo>
)