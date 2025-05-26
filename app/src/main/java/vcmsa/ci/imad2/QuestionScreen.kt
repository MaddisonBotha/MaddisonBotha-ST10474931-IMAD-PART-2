package vcmsa.ci.imad2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class QuestionScreen : AppCompatActivity() {

    // Declare the questions and answers arrays
    private val questions = arrayOf(
        "The United States declared independence from Great Britain on July 4, 1776.",
        "Henry VIII beheaded three of his wives.",
        "The Roman Empire was established in 1700 BC.",
        "The Great Wall of China is the longest defensive structure in the world.",
        "The American Revolutionary War began in 1775."
    )

    private val answers = booleanArrayOf(true, false, false, true, true)

    // Declare variables to track question index and score
    private var index = 0
    private var score = 0
    private var hasAnswered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question_screen)

        // Link UI elements to variables
        val headingText = findViewById<TextView>(R.id.headingText)
        val questionText = findViewById<TextView>(R.id.questionText)
        val answerText = findViewById<TextView>(R.id.answerText)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        // Load the first question
        loadNextQuestion(questionText, answerText, trueButton, falseButton)

        // True button logic
        trueButton.setOnClickListener {
            if (!hasAnswered) {
                checkAnswer(true, answerText, trueButton, falseButton)
            }
        }

        // False button logic
        falseButton.setOnClickListener {
            if (!hasAnswered) {
                checkAnswer(false, answerText, trueButton, falseButton)
            }
        }

        // Next button logic
        nextButton.setOnClickListener {
            if (index < questions.size - 1) {
                index++
                loadNextQuestion(questionText, answerText, trueButton, falseButton)
            } else {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("SCORE", score)
                startActivity(intent)
                finish()
            }
        }
    }

    // Load the next question and reset state
    private fun loadNextQuestion(
        questionText: TextView,
        answerText: TextView,
        trueButton: Button,
        falseButton: Button
    ) {
        questionText.text = questions[index]
        answerText.text = ""
        hasAnswered = false
        trueButton.isEnabled = true
        falseButton.isEnabled = true
    }

    // Check if the user's answer is correct
    private fun checkAnswer(
        userAnswer: Boolean,
        answerText: TextView,
        trueButton: Button,
        falseButton: Button
    ) {
        val correct = answers[index]

        if (userAnswer == correct) {
            answerText.text = "Correct!"
            score++
        } else {
            answerText.text = "Incorrect!"
        }

        hasAnswered = true
        trueButton.isEnabled = false
        falseButton.isEnabled = false
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


        //Title:OnClickListener in Android Studio
        //Author:stackOverflow
        //Date:20 May 2025
        //Version:1
        //Available:https://stackoverflow.com/questions/16927103/onclicklistener-in-android-studio

        //Title:Kotlin if...Else
        //Author:w3school.com
        //Date:21 May 2025
        //Version:1
        //Available:https://www.w3schools.com/kotlin/kotlin_conditions.php

