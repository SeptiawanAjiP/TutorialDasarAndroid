package com.dewakoding.tutorialdasaryoutube.retrofit

import retrofit2.Call
import retrofit2.http.GET


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 02/07/23 - 21.55

 **/
interface Api {

    @GET("get-faskes-vaksinasi")
    fun getListFaskes(): Call<FaskesResponse>
}