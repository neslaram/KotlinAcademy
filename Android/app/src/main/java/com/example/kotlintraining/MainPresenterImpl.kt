package com.example.kotlintraining

import com.example.kotlintraining.model.Note

class MainPresenterImpl(
        private var screen: MainScreen?,
        private val repository: Repository)
    : MainPresenter {
    override fun destroy() {

    }

    override fun addNote(note: Note) {
        repository.addNote(note)
        screen?.onNoteAdded(note)
    }

    override fun getNotes() {
        screen?.onNotesLoaded(repository.getNotes())
    }

    override fun deleteNotes() {
        repository.deleteNotes()
        screen?.onNotesDeleted(repository.getNotes())
    }

}