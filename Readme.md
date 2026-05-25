# 🎓 OOP Course System - Java Practice

A hands-on Java exercise to practice Object-Oriented Programming (OOP) concepts, developed using **IntelliJ IDEA** after migrating from **VS Code**.

## 🚀 Project Context
* **Student:** Gustavo
* **Mentor/Instructor:** Gemini (AI)
* **Development Environment:** IntelliJ IDEA (Migration test from VS Code)
* **Exercise Difficulty Level:** Tailored dynamically by Gemini to push learning boundaries step-by-step.

## 🧠 Concepts Applied
This exercise showcases the seamless combination of four core pillars of Object-Oriented Programming:
1. **Inheritance (`extends`):** Creating a specialized `PremiumCourse` class from a base `Course` class.
2. **Encapsulation (`private`):** Protecting data members like `price` and leveraging getters/methods to manipulate them safely.
3. **Polymorphism (`@Override`):** Overriding the `getPrice()` method in the daughter class to include specific dynamic pricing rules.
4. **Custom Attributes & Business Logic:** Handling a custom attribute (`mentorshipHours`) to inject specific pricing tiers alongside automated discounts.

## 📝 Problem Statement
The system simulates an online course platform:
* **`Course` (Parent Class):** Holds the base name and private price. It provides a method to apply absolute discounts (`applyDiscount`).
* **`PremiumCourse` (Daughter Class):** Adds mentorship hours. Its overridden `getPrice()` method fetches the current base price from the parent class (including discounts) and dynamically adds a fee of **$50 per mentorship hour**.
* **`Main` Class:** Instantiates a premium course, applies a discount, and prints out the dynamically calculated final price.

## 🎯 Verification Test
* **Input Data:** Base price = 100 Dollars, Mentorship = 5 hours, Discount = 20 Dollarrs.
* **Calculation Flow:** * Base Price after discount: 100 - 20 = 80 Dollars
    * Mentorship Cost: 5 hours * 50 = 250 Dollars
    * Total: 80 + 250 = 330 Dollars
* **Console Output:** `Final Price with Mentorship: 330.0 Reais` ✅
