package com.example.kotlintraining

interface Presenter {
    fun getNotes()
    fun addNote(note: String)
    fun onDestroy()
}