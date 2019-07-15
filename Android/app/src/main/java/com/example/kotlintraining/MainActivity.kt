package com.example.kotlintraining

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlintraining.model.Note
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_screen.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val noteMutableList = mutableListOf<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        addNoteButton?.setOnClickListener {
            noteMutableList.add(Note(textInput.text.toString(), Date().time))
            Log.d(MainActivity::class.java.name, noteMutableList.size.toString())
        }

        textInput?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(text: Editable?) {
                addNoteButton?.isEnabled = text?.toString().orEmpty().isNotEmpty()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        })


    }
}