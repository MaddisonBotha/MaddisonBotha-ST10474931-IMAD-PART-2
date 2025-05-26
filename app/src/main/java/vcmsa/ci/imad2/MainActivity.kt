package vcmsa.ci.imad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Reference the TextView and Button from the layout
        val headingText: TextView = findViewById(R.id.headingText)
        val detailsText: TextView = findViewById(R.id.details)
        val startButton: Button = findViewById(R.id.startButton)

        // Set the button to navigate to the Question screen
        startButton.setOnClickListener {
            val intent = Intent(this, QuestionScreen::class.java)
            startActivity(intent)
        }
    }
}
