package com.whydah.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Student::class, ReportCard::class, User::class, Library::class, UserPlaylist::class, Song::class, Playlist::class, PlaylistSongCrossRef::class],
    version = 15
)
abstract class MyRoomDB : RoomDatabase() {
    abstract fun studentDao(): StudentDao
}