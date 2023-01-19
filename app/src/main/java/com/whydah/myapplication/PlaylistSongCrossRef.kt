package com.whydah.myapplication

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    primaryKeys = ["playlistId", "songId"], foreignKeys = [
        ForeignKey(
            entity = Song::class,
            parentColumns = ["songId"],
            childColumns = ["songId"]
        ),
        ForeignKey(
            entity = Playlist::class,
            parentColumns = ["playlistId"],
            childColumns = ["playlistId"]
        )
    ]
)
data class PlaylistSongCrossRef(
    val playlistId: Long,
    val songId: Long
)
