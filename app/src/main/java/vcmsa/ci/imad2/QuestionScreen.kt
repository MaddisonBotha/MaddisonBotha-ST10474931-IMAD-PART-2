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

