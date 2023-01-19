package com.whydah.myapplication

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation

data class UserAndLibrary(
    @Embedded val user: User,

    @Relation(
        parentColumn = "userId",
        entityColumn = "userOwnerId"
    )
    val library: Library
)
