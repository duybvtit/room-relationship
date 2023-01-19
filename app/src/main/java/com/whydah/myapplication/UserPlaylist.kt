package com.whydah.myapplication

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(
    tableName = "user_playlist", foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["userId"],
            childColumns = ["userCreatorId"],
            onDelete = CASCADE
        )
    ]
)
data class UserPlaylist(
    @PrimaryKey
    val playlistId: Int,
    val userCreatorId: Int,
    val createdAt: Long,
    val playlistName: String
)
