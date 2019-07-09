package com.example.kotlintraining

interface Screen {
    fun addNote(note: String)
    fun onNotesCreated(notes: List<String>)
    fun onNoteAdded(note: String)
}