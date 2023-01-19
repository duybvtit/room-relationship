package com.whydah.myapplication

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithPlaylist(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userId",
        entityColumn = "userCreatorId"
    )
    val userPlaylists: List<UserPlaylist>
)