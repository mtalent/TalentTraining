package com.talent.talenttraining.model


import com.google.gson.annotations.SerializedName

data class TvShow(
    @SerializedName("first_air_date")
    val firstAirDate: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String
)