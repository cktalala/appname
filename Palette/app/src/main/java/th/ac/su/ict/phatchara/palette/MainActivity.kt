package th.ac.su.ict.phatchara.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.change)
        var cat1 = findViewById<Button>(R.id.a1)
        var cat2 = findViewById<Button>(R.id.a2)
        var cat3 = findViewById<Button>(R.id.a3)
        var cat4 = findViewById<Button>(R.id.a4)
        var cat5 = findViewById<Button>(R.id.a5)
        var cat6 = findViewById<Button>(R.id.a6)

        cat1.setOnClickListener {
            text.setBackgroundColor(Color.rgb(235,225,221))
            text.text = "235-225-221"

        }
        cat2.setOnClickListener {
            text.setBackgroundColor(Color.rgb(236,203,202))
            text.text = "236-203-202"
        }
        cat3.setOnClickListener {
            text.setBackgroundColor(Color.rgb(117,131,156))
            text.text = "117-131-156"
        }
        cat4.setOnClickListener {
            text.setBackgroundColor(Color.rgb(153,169,191))
            text.text = "153-169-191"
        }
        cat5.setOnClickListener {
            text.setBackgroundColor(Color.rgb(195,204,213))
            text.text = "195-204-213"
        }
        cat6.setOnClickListener {
            text.setBackgroundColor(Color.rgb(221,226,229))
            text.text = "221-226-229"
        }
    }
}