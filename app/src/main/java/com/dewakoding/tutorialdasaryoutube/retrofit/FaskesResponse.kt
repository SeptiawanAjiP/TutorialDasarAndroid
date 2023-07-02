package com.dewakoding.tutorialdasaryoutube.retrofit

import com.google.gson.annotations.SerializedName

/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 02/07/23 - 22.02

 **/
data class FaskesResponse(
    val success: Boolean,
    val message: String,
    @SerializedName("count_total")
    val countTotal: Int,
    val data: List<Faskes>
)


