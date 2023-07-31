package com.dewakoding.tutorialdasaryoutube.room

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityListUserBinding
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
class ListUserActivity: AppCompatActivity() {
    private val binding by lazy { ActivityListUserBinding.inflate(layoutInflater) }
    private var listUser = mutableListOf<User>()
    private lateinit var database: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        database = AppDatabase.getInstance(applicationContext)

        binding.fab.setOnClickListener {
            val intent = Intent(applicationContext, InsertEditActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        init()
    }

    fun init() {
        listUser.clear()
        CoroutineScope(Dispatchers.IO).launch {
            listUser.addAll(database.userDao().getData())

        }

        setAdapter()
    }

    fun setAdapter() {
        binding.rvListUser.adapter = UserAdapter(listUser)
    }
}