package com.whydah.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "playlist")
data class Playlist(
    @PrimaryKey
    val playlistId: Long,
    val playlistName: String
)