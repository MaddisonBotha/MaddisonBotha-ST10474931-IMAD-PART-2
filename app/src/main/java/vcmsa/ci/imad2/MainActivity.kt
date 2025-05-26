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
