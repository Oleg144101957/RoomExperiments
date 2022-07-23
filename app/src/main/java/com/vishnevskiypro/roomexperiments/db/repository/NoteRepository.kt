package com.vishnevskiypro.roomexperiments.db.repository

import androidx.lifecycle.LiveData
import com.vishnevskiypro.roomexperiments.model.NoteModel

interface NoteRepository {

    val allNotes: LiveData<List<NoteModel>>

    suspend fun insertNote(noteModel: NoteModel, onSuccess:() -> Unit)
    suspend fun deleteNote(noteModel: NoteModel, onSuccess:() -> Unit)

}