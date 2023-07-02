package com.dewakoding.tutorialdasaryoutube

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityRegisterBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 22/06/23 - 04.09

 **/
class RegisterActivity: AppCompatActivity() {
    private val binding by lazy {ActivityRegisterBinding.inflate(layoutInflater)}
    lateinit var nama: String
    var jenisKelamin: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("REGISTER_ACTIVITY", "onCreate")
        setContentView(binding.root)


        binding.btnSimpan.setOnClickListener {
            nama = binding.etNama.text.toString()

            if (binding.rbLakiLaki.isChecked) {
                jenisKelamin = "LAKI-LAKI"
            } else if (binding.rbPerempuan.isChecked) {
                jenisKelamin = "PEREMPUAN"
            }

            if (nama.isNullOrEmpty() || jenisKelamin.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Data belum diisi lengkap", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(applicationContext, DetailActivity::class.java)
                intent.putExtra("nama", nama)
                intent.putExtra("jenis_kelamin", jenisKelamin)
                startActivity(intent)
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("REGISTER_ACTIVITY", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("REGISTER_ACTIVITY", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("REGISTER_ACTIVITY", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("REGISTER_ACTIVITY", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("REGISTER_ACTIVITY", "onDestroy")
    }
}