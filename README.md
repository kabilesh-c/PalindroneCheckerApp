# Palindrome Checker App

## Use Case 1: Application Entry & Welcome Message

---

## 📌 Overview

The objective of the Palindrome Checker App is to design and implement a
console-based Java application that validates whether a given string
is a palindrome under different conditions.

This branch implements **Use Case 1 (UC1)**.

At this stage, the focus is only on application startup behavior.

No palindrome validation logic is implemented yet.

---

## 🎯 Goal of UC1

To establish a clear and structured application entry flow.

When the program starts:

1. JVM invokes the `main()` method.
2. A welcome message is displayed.
3. Application name is displayed.
4. Application version is displayed.
5. Program is ready for further use cases.

---

## 👤 Actor

User

---

## 🔄 Flow of Execution

- Program starts.
- JVM calls `public static void main(String[] args)`.
- Welcome message is shown.
- Application details are displayed.
- Execution ends or moves to next use case.

---

## 🧠 Key Concepts Used

- **Class**  
  Acts as a container for the Palindrome Checker application logic.

- **Main Method**  
  Entry point of the Java application:

public static void main(String[] args)


- **Static Keyword**  
  Allows the JVM to invoke the `main()` method without creating an object.

- **Console Output**  
  Uses `System.out.println()` to display messages.

- **Application Flow Control**  
  Defines the startup behavior before palindrome processing begins.

---

## 🛠️ How to Compile and Run

### Step 1: Compile

javac PalindromeCheckerApp.java


### Step 2: Run

java PalindromeCheckerApp


---

## 📦 Current Version

Version: **1.0**

---

## 🚀 Status

✔ Application Entry Implemented  
✔ Welcome Message Displayed  
✔ Version Displayed  
✘ No Palindrome Logic (Will be implemented in upcoming use cases)

---

**Branch:** UC1  
**Author:** Kabilesh C  