package oliveiradev.com.reminder_kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by felipe on 28/02/16.
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    inline fun <reified T : Activity> navigate(isStartForResult: Boolean = false, requestCode: Int = 0) {
        var intent = Intent(this, T::class.java)
        startActivity(intent, isStartForResult, requestCode)
    }

    fun startActivity(intent: Intent, isStartForResult: Boolean, requestCode: Int) {
        when (isStartForResult) {
            true -> startActivityForResult(intent, requestCode)
            false -> startActivity(intent)
        }
    }
}
