package com.example.kotlintraining

class PresenterImpl(private var screen: Screen?, private var repository: Repository?) : Presenter {

    override fun addNote(note: String) {
        repository?.addNote(note)
        screen?.onNoteAdded(note)
    }

    override fun getNotes() {
        repository?.let {
            screen?.onNotesCreated(it.getNotes())
        }
    }

    override fun onDestroy() {
        screen = null
        repository = null
    }
}