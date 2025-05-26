# 🧠 Flashcard Quiz App

A Kotlin-based Android application that tests your historical knowledge through an interactive true/false flashcard quiz. Designed with a clean UI, instant feedback, and a results summary, this app provides a fun and educational experience.

---

## 📘 Overview

The Flashcard Quiz App is a mobile learning tool developed in Android Studio using Kotlin. It presents a series of five historical statements where users must answer either "True" or "False." After each response, feedback is shown, and at the end of the quiz, users receive a total score along with the option to review all correct answers. The app is fully functional, visually engaging, and designed with usability in mind.

---

## 🎯 Purpose

This project was created for the IMAD5112 Assignment 2 to demonstrate a practical understanding of:

- Kotlin language syntax and structure
- Android development best practices
- User interface design using `ConstraintLayout`
- Navigation and interaction between activities
- Input validation, scoring logic, and user experience principles

---

## 📱 Features on Each Screen

### 🔹 Welcome Screen
- Presents the app title and a short description of its purpose.
- Contains a **Start** button that launches the quiz.
  ![image](https://github.com/user-attachments/assets/4bbc134b-70f7-4a47-801e-14f7f7a248bd)


### 🔹 Question Screen
- Displays one true/false historical question at a time.
- Users tap either **True** or **False** to answer.
- After submitting an answer, a **Correct!** or **Incorrect!** message is displayed.
- The user cannot change their answer after selecting it — the buttons are disabled to prevent cheating or duplicate scoring.
- A **Next Question** button loads the following question until all five are completed.
  ![image](https://github.com/user-attachments/assets/f9eaffe5-71f8-4d90-afc5-e6444447bd75)


### 🔹 Score Screen
- Shows the user's total score out of 5.
- Displays a personalized message:
  - **"Amazing Job!"** for high scores (4–5)
  - **"Not bad, keep trying!"** for medium scores (2–3)
  - **"You need to study harder."** for low scores (0–1)
- Includes a **Review** button to revisit all questions with correct answers.
- Has an **Exit** button to close the app completely.
 ![image](https://github.com/user-attachments/assets/7392095c-416a-42b8-9efc-59eae2bb5c81) ![image](https://github.com/user-attachments/assets/e75340be-765f-48f5-be78-c93d0e8d5a4d)



---

## 🎨 Design Considerations and Personal Touches

- **Color Scheme**:
  - `#FF5722` for headers to create bold impact
  - `#00BCD4` and `#FF9800` for buttons and highlights to draw attention
  - `#FFFFFF` backgrounds with transparency for readability over images

- **Fonts & Layout**:
  - Large, legible text sizes (`20sp`–`40sp`)
  - Clean layout with consistent vertical spacing
  - `ConstraintLayout` ensures responsiveness across all screen sizes

- **Background Images**:
  - Custom background images (`image1`, `image2`, `screen3`) set the tone for each screen
  - All images are stretched using `centerCrop` or full-screen scaling to maintain aesthetic consistency

- **Feedback Enhancements**:
  - Emojis used in score messages to increase engagement and make feedback feel personal

---

## 🔁 Usability & Functionality

- Quiz only accepts one answer per question — buttons are disabled after answering to prevent score abuse.
- Feedback is displayed instantly to help users learn and stay engaged.
- Score is calculated in real-time and shown at the end without delay.
- The review feature allows learners to reflect on the content and improve.
- The app uses `Intents` to manage smooth transitions between screens.
- All questions and answers are stored in parallel arrays for simple looping and logic.

---

## 🔧 Development Workflow

- Built entirely in **Android Studio** using **Kotlin**.
- UI created using **ConstraintLayout** for responsiveness.
- Three Kotlin classes:
  - `MainActivity.kt` (Welcome screen)
  - `QuestionScreen.kt` (Quiz logic, feedback, and scoring)
  - `MainActivity3.kt` (Score and review screen)
- GitHub used for version control — commits include meaningful messages reflecting project progress.
- Attribution comments are provided in each file to credit external sources (e.g. Stack Overflow, W3Schools).
- GitHub Actions will be configured to run automated builds and ensure project consistency across environments.

---

## ✅ Summary

The Flashcard Quiz App combines clean design, real-time interaction, and clear logic flow to create an educational experience. With built-in scoring, feedback, and answer review, it’s not just a test — it’s a tool for learning. This project meets the criteria for the IMAD5112 assignment and demonstrates best practices in Android development.

---

