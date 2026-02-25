## 🚀 Current Version: 12.0

---

### UC12 – Strategy Pattern

Goal:
Choose palindrome algorithm dynamically at runtime.

Design:
- Created PalindromeStrategy interface.
- Implemented:
    - StackStrategy
    - DequeStrategy
- Injected strategy into PalindromeChecker (Context class).

Concepts:
- Interface
- Polymorphism
- Strategy Pattern
- Runtime behavior selection

Data Structure:
Varies depending on chosen strategy (Stack or Deque)

Benefits:
- Open for extension, closed for modification.
- Easy to add new algorithms.
- Clean architecture.