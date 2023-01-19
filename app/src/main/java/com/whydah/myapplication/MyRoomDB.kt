package com.whydah.myapplication

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RenameTable
import androidx.room.RoomDatabase
import androidx.room.migration.AutoMigrationSpec

@Database(
    entities = [Student::class, ReportCard::class, User::class, Library::class, UserPlaylist::class, Song::class, Playlist::class, PlaylistSongCrossRef::class, Artist::class],
    version = 22,
    exportSchema = true,
    autoMigrations = [
        AutoMigration(from = 21, to = 22)
    ]
)
abstract class MyRoomDB : RoomDatabase() {
    abstract fun studentDao(): StudentDao

    @RenameTable(fromTableName = "PlaylistSongCrossRef", toTableName = "play_list_song_cross_ref")
    class PlaylistSongMigration() : AutoMigrationSpec

    @RenameTable(fromTableName = "Playlist", toTableName = "playlist")
    class PlaylistMigration(): AutoMigrationSpec
}

