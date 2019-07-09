package com.example.kotlintraining

interface Repository {
    fun getNotes(): List<String>
    fun addNote(note: String)
}