package com.whydah.myapplication

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStudent(student: Student)

    @Query("Select * from Student where id=:studentId")
    fun getStudentById(studentId: Long): Flow<List<Student>>
}