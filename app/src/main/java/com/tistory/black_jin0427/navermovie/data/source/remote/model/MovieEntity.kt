package com.tistory.black_jin0427.navermovie.data.source.remote.model

import com.google.gson.annotations.SerializedName

data class MovieEntity(
    @field:SerializedName("lastBuildDate") val lastBuildDate: String,
    @field:SerializedName("total") val total: Int,
    @field:SerializedName("start") val start: Int,
    @field:SerializedName("display") val display: Int,
    @field:SerializedName("itemEntities") val itemEntities: List<MovieItemEntity>
)