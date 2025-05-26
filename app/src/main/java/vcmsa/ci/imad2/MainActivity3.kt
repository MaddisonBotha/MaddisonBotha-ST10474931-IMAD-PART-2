package vcmsa.ci.imad2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        // Connect UI elements
        val headTxt = findViewById<TextView>(R.id.headTxt)
        val resultText = findViewById<TextView>(R.id.resultText)
        val revButton = findViewById<Button>(R.id.revButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Get the score from the Intent
        val score = intent.getIntExtra("SCORE", 0)

        // 🔽 Generate feedback message using if-else structure
        var feedbackMessage = ""
        if (score >= 4) {
            feedbackMessage = "Amazing Job! 🎉"
        } else if (score >= 2) {
            feedbackMessage = "Not bad, keep trying! 💪"
        } else {
            feedbackMessage = "You need to study harder. 📚"
        }

        // 🔽 Display the score and feedback
        resultText.text = "$feedbackMessage\nYou scored $score out of 5."

        // 🔽 Show correct answers on Review button click
        revButton.setOnClickListener {
            resultText.text = """
                ✅ Review Answers:

                1. True – The United States declared independence in 1776.
                2. False – Henry VIII did not behead three wives.
                3. False – The Roman Empire was not founded in 1700 BC.
                4. True – The Great Wall is the longest defensive structure.
                5. True – The American Revolutionary War began in 1775.
            """.trimIndent()
        }

        // 🔽 Exit app on Exit button click
        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}
