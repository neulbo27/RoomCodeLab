package pe.hankyu.roomwordsample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import pe.hankyu.roomwordsample.viewmodel.WordViewModel

class NewWordActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_REPLY = "pe.hankyu.wordlistsql.REPLY"
    }

    private val editTextView by lazy { findViewById<EditText>(R.id.edit_word) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (editTextView.text.isEmpty()) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val word = editTextView.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, word)
                setResult(Activity.RESULT_OK, replyIntent)
            }

            finish()
        }
    }
}
