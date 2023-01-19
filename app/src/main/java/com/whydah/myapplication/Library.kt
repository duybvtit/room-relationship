package com.whydah.myapplication

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(
    tableName = "library", foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["userId"],
            childColumns = ["userOwnerId"],
            onDelete = CASCADE
        )
    ]
)
data class Library(
    @PrimaryKey
    val primaryId: Int,
    val userOwnerId: Int,
    val libraryName: String
)
