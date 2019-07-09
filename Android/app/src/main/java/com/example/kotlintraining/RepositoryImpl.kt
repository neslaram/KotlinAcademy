package com.example.kotlintraining

class RepositoryImpl(private val list: MutableList<String> = mutableListOf()) : Repository {
    override fun addNote(note: String) {
        this.list.add(note)
    }

    override fun getNotes(): List<String> {
        return list
    }

}