package com.talent.talenttraining.model


import com.google.gson.annotations.SerializedName
import com.talent.talenttraining.models.Artist

data class ArtistsList(
    @SerializedName("known_for")
    val knownFor: List<Artist>
)