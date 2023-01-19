package com.whydah.myapplication

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "playlist_song_cross_ref",
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
