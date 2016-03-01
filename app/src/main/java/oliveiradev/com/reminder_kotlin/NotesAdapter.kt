package oliveiradev.com.reminder_kotlin

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.note_item.view.*
import java.util.*

/**
 * Created by felipe on 28/02/16.
 */
class NotesAdapter(val notes: ArrayList<Note>) : RecyclerView.Adapter<NotesAdapter.ViewHolder>(){


    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(parent.inflate(R.layout.note_item,false))
    }

    fun add(note: Note):Unit{
        notes.add(note)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(note: Note) = with(itemView) {
            note_text.text = note.content
            card.setCardBackgroundColor(Color.parseColor(note.color))
        }
    }
}
