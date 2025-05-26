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

// Title: How to achieve setOnClickListener in Kotlin
// Author: Stack Overflow Community
// Date: June 1, 2017
// Version: 1
// Available: https://stackoverflow.com/questions/44301301/android-how-to-achieve-setonclicklistener-in-kotlin

// Title: Kotlin Conditions and If..Else
// Author: W3Schools
// Date: [Accessed May 26, 2025]
// Version: 1
// Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

// Title: Kotlin Android start new Activity
// Author: Stack Overflow Community
// Date: August 7, 2017
// Version: 1
// Available: https://stackoverflow.com/questions/45518139/kotlin-android-start-new-activity

// Title: Arrays | Kotlin Documentation
// Author: Kotlin Documentation
// Date: [Accessed May 26, 2025]
// Version: 1
// Available: https://kotlinlang.org/docs/arrays.html

// Title: Kotlin for Loop (With Examples)
// Author: Programiz
// Date: [Accessed May 26, 2025]
// Version: 1
// Available: https://www.programiz.com/kotlin-programming/for-loop

// Title: How to get and set a text to TextView in Android using Kotlin?
// Author: Stack Overflow Community
// Date: May 21, 2017
// Version: 1
// Available: https://stackoverflow.com/questions/44096838/kotlin-how-to-get-and-set-a-text-to-textview-in-android-using-kotlin

// Title: How to call finishAffinity() in Service class?
// Author: Stack Overflow Community
// Date: June 22, 2016
// Version: 1
// Available: https://stackoverflow.com/questions/37968011/how-to-call-finishaffinity-in-service-class

// Title: findViewById in Kotlin - Android Ideas
// Author: Medium Article
// Date: [Accessed May 26, 2025]
// Version: 1
// Available: https://medium.com/android-ideas/findviewbyid-in-kotlin-ce4d22193c79

// Title: Build a responsive UI with ConstraintLayout
// Author: Android Developers
// Date: [Accessed May 26, 2025]
// Version: 1
// Available: https://developer.android.com/develop/ui/views/layout/constraint-layout

// Title: Kotlin When Expressions
// Author: W3Schools
// Date: [Accessed May 26, 2025]
// Version: 1
// Available: https://www.w3schools.com/kotlin/kotlin_when.php


