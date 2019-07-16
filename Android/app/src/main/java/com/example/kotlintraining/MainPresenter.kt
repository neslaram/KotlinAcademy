package com.example.kotlintraining

import com.example.kotlintraining.model.Note

interface MainPresenter {
    fun addNote(note: Note)
    fun getNotes()
    fun deleteNotes()
    fun destroy()
}
