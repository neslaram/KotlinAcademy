package com.example.kotlintraining

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintraining.model.Note

class NoteAdapter(private val list: MutableList<Note>) : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simple_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun addItem(note: Note) {
        list.add(0, note)
        notifyItemInserted(0)
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(note: Note) {
            view.findViewById<TextView>(R.id.title_text)?.text = note.text
            view.findViewById<TextView>(R.id.date_text)?.text = note.date.toString()
        }
    }
}