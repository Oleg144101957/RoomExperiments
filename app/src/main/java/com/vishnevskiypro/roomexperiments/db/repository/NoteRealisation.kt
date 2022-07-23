package com.vishnevskiypro.roomexperiments.db.repository

import androidx.lifecycle.LiveData
import com.vishnevskiypro.roomexperiments.db.dao.NoteDao
import com.vishnevskiypro.roomexperiments.model.NoteModel

class NoteRealisation(private val noteDao: NoteDao) : NoteRepository {

    override val allNotes: LiveData<List<NoteModel>>
        get() = noteDao.getAllNotes()

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.insert(noteModel)
        onSuccess()
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.delete(noteModel)
        onSuccess()
    }
}