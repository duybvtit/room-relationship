package com.whydah.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "first_name")
    val firstName: String = "",
    @ColumnInfo(name = "last_name")
    val lastName: String = ""
)