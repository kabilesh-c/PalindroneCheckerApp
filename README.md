# Palindrome Checker – Data Structures Evolution

## 📌 Project Overview
This project demonstrates palindrome validation using different algorithmic approaches and data structures.

Each Use Case introduces a new data structure or technique to understand efficiency and structural behavior.

---

## 🚀 Current Version: 7.0

---

## 📚 Use Case Evolution

### UC4 – Two Pointer Technique
- Concept: Compare first and last characters moving inward.
- Data Structure: None
- Time Complexity: O(n)
- Space Complexity: O(1)
- Most space-efficient solution.

---

### UC5 – Stack-Based Validation (LIFO)
- Concept: Reverse string using stack.
- Operations: push(), pop()
- Data Structure: Stack
- Time Complexity: O(n)
- Space Complexity: O(n)
- Demonstrates LIFO principle.

---

### UC6 – FIFO vs LIFO Comparison
- Concept: Compare Queue (FIFO) and Stack (LIFO).
- Operations:
  - Enqueue → add()
  - Dequeue → remove()
  - Push → push()
  - Pop → pop()
- Data Structures: Queue, Stack
- Time Complexity: O(n)
- Space Complexity: O(n)

Demonstrates behavioral difference between FIFO and LIFO.

---

### UC7 – Deque-Based Validation
- Concept: Compare front and rear using Deque.
- Operations:
  - addLast()
  - removeFirst()
  - removeLast()
- Data Structure: Deque (Double Ended Queue)
- Time Complexity: O(n)
- Space Complexity: O(n)

Eliminates the need for separate stack or queue by enabling two-end access in a single structure.

---

## ⚙️ How to Run

1. Compile:
   javac PalindromeCheckerApp.java

2. Run:
   java PalindromeCheckerApp

---

## 🧠 Learning Outcome

- Understanding Stack (LIFO)
- Understanding Queue (FIFO)
- Understanding Deque (Two-End Access)
- Comparing algorithm efficiency
- Applying data structures for optimized solutions