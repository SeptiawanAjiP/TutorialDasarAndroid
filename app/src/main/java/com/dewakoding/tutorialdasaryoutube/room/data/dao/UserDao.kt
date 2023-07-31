package com.dewakoding.tutorialdasaryoutube.room.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.dewakoding.tutorialdasaryoutube.room.data.entity.User


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 13/07/23 - 04.19

 **/
@Dao
interface UserDao {

    @Insert
    fun insertData(user: User)

    @Query("SELECT * FROM user")
    fun getData(): List<User>

}