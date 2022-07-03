package com.talent.talenttraining.model


import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("id")
    val id: Int,
    @SerializedName("known_for")
    val knownFor: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("popularity")
    val popularity: String,
    @SerializedName("profile_path")
    val profilePath: String
)