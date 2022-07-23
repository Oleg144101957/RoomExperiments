package com.vishnevskiypro.roomexperiments.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.vishnevskiypro.roomexperiments.REPOSITORY
import com.vishnevskiypro.roomexperiments.db.NoteDatabase
import com.vishnevskiypro.roomexperiments.db.repository.NoteRealisation
import com.vishnevskiypro.roomexperiments.model.NoteModel

class StartViewModel(application: Application) : AndroidViewModel(application) {

    val context = application


    fun initDatabase(){
        val daoNote = NoteDatabase.getInstance(context).getNoteDao()
        REPOSITORY = NoteRealisation(daoNote)

    }

    fun getAllNotes(): LiveData<List<NoteModel>>{
        return REPOSITORY.allNotes
    }

}