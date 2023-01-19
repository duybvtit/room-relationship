package com.whydah.myapplication

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDao {
    @Query("Select * from User")
    fun getUsersAndLibrary(): List<UserAndLibrary>

    @Query("Select * from User where userId=:userId")
    fun getAllPlaylistOfUserById(userId: Int): UserWithPlaylist
}