package oliveiradev.com.reminder_kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.add_notes_activity.*
import java.util.*

/**
 * Created by felipe on 28/02/16.
 */
open class AddNotesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_notes_activity)
        note_create_action.setOnClickListener {
            setResult(Activity.RESULT_OK,getIntentResult())
            finish()
        }
    }

    fun getIntentResult(): Intent {
        return Intent().putExtra("bundle",getNote())
    }

    fun getNote():Bundle{
        val bundle:Bundle = Bundle()
        bundle.putSerializable("key",Note(note_content.text.toString(),getRadomColor()))
        return bundle
    }

    private fun getRadomColor(): String {
        val radom: Random = Random()
        val i:Int = radom.nextInt(Colors.COLORS.size)
        return Colors.COLORS[i]
    }

}
