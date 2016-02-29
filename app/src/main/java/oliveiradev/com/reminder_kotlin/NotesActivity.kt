package oliveiradev.com.reminder_kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.Menu
import kotlinx.android.synthetic.main.notes_activity.*

/**
 * Created by felipe on 28/02/16.
 */
open class NotesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notes_activity)
        setSupportActionBar(toolbar)

        recycler.layoutManager = GridLayoutManager(this,2)
        recycler.adapter = NotesAdapter(emptyList())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater = menuInflater
        inflater.inflate(R.menu.menu_add_note, menu);
        return true;
    }
}
