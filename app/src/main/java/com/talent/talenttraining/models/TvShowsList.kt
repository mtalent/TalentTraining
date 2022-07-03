package com.talent.talenttraining.model


import com.google.gson.annotations.SerializedName

data class TvShowsList(
    @SerializedName("results")
    val results: List<TvShow>
    )