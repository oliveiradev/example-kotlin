package oliveiradev.com.reminder_kotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by felipe on 28/02/16.
 */
class NotesAdapter(val notes: List<String>) : RecyclerView.Adapter<NotesAdapter.ViewHolder>(){


    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(parent.inflate(R.layout.note_item,false))
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bind(){

        }
    }
}
