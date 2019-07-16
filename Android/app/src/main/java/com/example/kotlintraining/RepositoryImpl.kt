package com.example.kotlintraining

import com.example.kotlintraining.model.Note

class RepositoryImpl : Repository {
    private val mutableList: MutableList<Note> = mutableListOf()

    override fun addNote(note: Note) {
        mutableList.add(0, note)
    }

    override fun getNotes(): List<Note> {
        return mutableList
    }

    override fun deleteNotes() {
        mutableList.clear()
    }

}
