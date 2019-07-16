package com.example.kotlintraining

import com.example.kotlintraining.model.Note

interface Repository {
    fun addNote(note: Note)
    fun getNotes(): List<Note>
    fun deleteNotes()
}
