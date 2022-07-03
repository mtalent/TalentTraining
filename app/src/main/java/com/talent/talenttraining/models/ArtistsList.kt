package com.talent.talenttraining.model


import com.google.gson.annotations.SerializedName

data class ArtistsList(
    @SerializedName("known_for")
    val knownFor: List<Artist>
)