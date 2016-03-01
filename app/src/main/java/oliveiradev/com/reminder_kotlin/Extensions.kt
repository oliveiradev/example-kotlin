package oliveiradev.com.reminder_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by felipe on 28/02/16.
 */

fun ViewGroup.inflate(layoutRes: Int,attachToRoot: Boolean): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}
