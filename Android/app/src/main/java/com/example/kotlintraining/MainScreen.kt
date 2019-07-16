package com.example.kotlintraining

import com.example.kotlintraining.model.Note

interface MainScreen {
    fun onNotesLoaded(notes: List<Note>)
    fun onNoteAdded(note: Note)
    fun onNotesDeleted(notes: List<Note>)
}
