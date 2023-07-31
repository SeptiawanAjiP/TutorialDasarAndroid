package com.dewakoding.tutorialdasaryoutube.room.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dewakoding.tutorialdasaryoutube.room.data.dao.UserDao
import com.dewakoding.tutorialdasaryoutube.room.data.entity.User


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 13/07/23 - 04.16

 **/
@Database(entities = [User::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, AppDatabase::class.java, "user_database")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }

}