package com.dewakoding.tutorialdasaryoutube

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityDetailBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 22/06/23 - 04.09

 **/
class DetailActivity: AppCompatActivity() {
    private val binding by lazy {ActivityDetailBinding.inflate(layoutInflater)}
    var nama: String? = null
    var jenisKelamin: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        nama = intent.getStringExtra("nama")
        jenisKelamin = intent.getStringExtra("jenis_kelamin")
        binding.tvDetail.text = "Halo : ${nama}, Jenis Kelamin : ${jenisKelamin}"

        Glide.with(this)
            .load("https://images.pexels.com/photos/1563256/pexels-photo-1563256.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
            .into(binding.imgProfile)

        binding.btnLihatHobi.setOnClickListener {
            val intent = Intent(applicationContext, HobiActivity::class.java)
            startActivity(intent)
        }

    }
}