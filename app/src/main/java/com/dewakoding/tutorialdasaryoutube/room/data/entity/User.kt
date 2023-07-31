package com.dewakoding.tutorialdasaryoutube.room.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 13/07/23 - 04.12

 **/
@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val uid: Int? = null,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?,
)
