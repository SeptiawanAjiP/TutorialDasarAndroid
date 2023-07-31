package com.dewakoding.tutorialdasaryoutube.room

import android.os.Binder
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityInsertUpdateBinding
import com.dewakoding.tutorialdasaryoutube.room.data.AppDatabase
import com.dewakoding.tutorialdasaryoutube.room.data.entity.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 13/07/23 - 04.22

 **/
class InsertEditActivity: AppCompatActivity() {
    private val binding by lazy { ActivityInsertUpdateBinding.inflate(layoutInflater) }
    private lateinit var database: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        database = AppDatabase.getInstance(applicationContext)

        binding.btnSimpan.setOnClickListener {
            if (binding.etFirstName.text.isNullOrEmpty() || binding.etLastName.text.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Ada data yang masih kosong", Toast.LENGTH_SHORT).show()
            } else {
                CoroutineScope(Dispatchers.IO).launch {
                    database.userDao().insertData(User(
                        null,
                        firstName = binding.etFirstName.text.toString(),
                        lastName = binding.etLastName.text.toString()
                    ))
                }
                finish()
            }
        }
    }
}