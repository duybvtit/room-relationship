package com.whydah.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "artist")
data class Artist(
    @PrimaryKey(autoGenerate = true)
    val artistId: Long,
    val artistName: String
)
