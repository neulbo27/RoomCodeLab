package pe.hankyu.roomwordsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.hankyu.roomwordsample.adapter.WordListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = WordListAdapter(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview).apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}
