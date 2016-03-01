package oliveiradev.com.reminder_kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.notes_activity.*
import kotlinx.android.synthetic.main.notes_content.*
import java.util.*

/**
 * Created by felipe on 28/02/16.
 */
open class NotesActivity : BaseActivity() {

    companion object{
        val REQUEST_NEW_NOTE = 1023
    }

    val adapter: NotesAdapter = NotesAdapter(ArrayList()){removeNoteOnAdapter(it)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notes_activity)
        setSupportActionBar(toolbar)

        recycler.layoutManager = GridLayoutManager(this,2)
        recycler.adapter = adapter

        fab.setOnClickListener { navigate<AddNotesActivity>(true,REQUEST_NEW_NOTE) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_NEW_NOTE && Activity.RESULT_OK == resultCode){
            extractIntentContent(data)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    fun extractIntentContent(data:Intent?):Unit{
        val bundle: Bundle = data!!.getBundleExtra("bundle")
        addNoteOnAdapter(bundle.get("key") as Note)
    }

    fun addNoteOnAdapter(note: Note):Unit{
        adapter.add(note)
    }

    fun removeNoteOnAdapter(note: Note):Unit{
        adapter.remove(note)
    }
}
