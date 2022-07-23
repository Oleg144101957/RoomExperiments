package com.vishnevskiypro.roomexperiments.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.vishnevskiypro.roomexperiments.model.NoteModel


@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(noteModel: NoteModel)

    @Delete
    suspend fun delete(noteModel: NoteModel)

    @Query("SELECT * FROM noteTable")
    fun getAllNotes() : LiveData<List<NoteModel>>

}