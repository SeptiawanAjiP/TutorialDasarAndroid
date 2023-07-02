package com.dewakoding.tutorialdasaryoutube.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityFaskesBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 02/07/23 - 22.08

 **/
class FaskesActivity: AppCompatActivity() {

    private val binding by lazy { ActivityFaskesBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        RetrofitClient.instance.getListFaskes().enqueue(object: Callback<FaskesResponse> {
            override fun onResponse(
                call: Call<FaskesResponse>,
                response: Response<FaskesResponse>
            ) {
                val code = response.code().toString()
                if (code.equals("200")) {
                    setAdapter(response.body())
                }
            }

            override fun onFailure(call: Call<FaskesResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }

    private fun setAdapter(faskesResponse: FaskesResponse?) {
        binding.rvFaskes.adapter = FaskesAdapter(faskesResponse!!.data)
    }
}