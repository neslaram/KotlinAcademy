package com.example.kotlintraining

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_screen.*

class MainActivity : AppCompatActivity(), Screen {

    private var presenter: Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        this.setupNotesList()
        presenter = PresenterImpl(this, RepositoryImpl())
        presenter?.getNotes()
        floatingActionButton.setOnClickListener {
            addNote("")
        }
    }

    override fun onDestroy() {
        presenter?.onDestroy()
        super.onDestroy()
    }

    override fun addNote(note: String) {
        presenter?.addNote(note)
    }

    override fun onNotesCreated(notes: List<String>) {
        (notesRecycler?.adapter as NoteAdapter).setItems(notes)

    }

    override fun onNoteAdded(note: String) {
        (notesRecycler?.adapter as NoteAdapter).addItem(note)
    }

    private fun setupNotesList() {
        notesRecycler.apply {
            adapter = NoteAdapter()
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(DividerItemDecoration(context, LinearLayout.VERTICAL))
        }
    }
}