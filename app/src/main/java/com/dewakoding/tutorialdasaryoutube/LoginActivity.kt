package com.dewakoding.tutorialdasaryoutube

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityLoginLinearBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 17/06/23 - 03.25

 **/
class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityLoginLinearBinding
    lateinit var email: String
    lateinit var password: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("PRINT-LOG", "1")
        Log.d("PRINT-LOG", "2")
        binding.btnLogin.setOnClickListener {
            email = binding.etEmail.text.toString()
            password = binding.etPassword.text.toString()
            Log.d("PRINT-LOG", email)
            if (isValidate(email, password)) {
                Toast.makeText(applicationContext, "Ups !!! Email atau password masih kosong", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent()
                Toast.makeText(applicationContext, "Sukses ! Anda sudah memasukan Email dan Password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun isValidate(email: String, password: String): Boolean {
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            return false
        }

        return true


    }
}