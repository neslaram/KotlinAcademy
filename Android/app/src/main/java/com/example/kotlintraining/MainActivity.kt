package com.example.kotlintraining

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintraining.model.Note
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_screen.*
import java.util.*

class MainActivity : AppCompatActivity(), MainScreen {

    companion object {
        val TAG: String = MainActivity::class.java.name
    }

    private var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        presenter = MainPresenterImpl(this, RepositoryImpl())

        addNoteButton?.setOnClickListener {
            presenter?.addNote(Note(textInput?.text.toString(), Date().time))
            textInput.setText("")
        }

        clearNotesButton?.setOnClickListener {
            presenter?.deleteNotes()
        }

        textInput?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(text: Editable?) {}

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
                addNoteButton?.isEnabled = text?.toString().orEmpty().isNotEmpty()
            }
        })

        notesList?.apply {
            adapter = NoteAdapter(mutableListOf())
            addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        }
        presenter?.getNotes()
    }

    override fun onNotesLoaded(notes: List<Note>) {
        (notesList?.adapter as NoteAdapter).setItems(notes)
        notesList?.layoutManager?.scrollToPosition(0)
    }

    override fun onNoteAdded(note: Note) {
        (notesList?.adapter as NoteAdapter).addItem(note)
        notesList?.layoutManager?.scrollToPosition(0)
    }

    override fun onNotesDeleted(notes: List<Note>) {
        (notesList?.adapter as NoteAdapter).setItems(notes)
        notesList?.layoutManager?.scrollToPosition(0)
    }
}