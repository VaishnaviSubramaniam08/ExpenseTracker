💰 Expense Tracker

A simple Java console application to manage and track personal expenses. Add, view, edit, delete expenses, and calculate the total amount spent—all from your terminal.

🚀 Features

✅ Add new expenses with date, category, description, and amount

✅ View all recorded expenses

✅ Edit existing expenses by index

✅ Delete expenses by index

✅ Calculate total expenses

🛠 Technologies

Language: Java

Data Structure: ArrayList

Input Handling: Scanner

📂 Classes Overview
1️⃣ Expense

Stores a single expense

Attributes: date, category, description, amount

Includes getters and setters

2️⃣ ExpenseTracker

Handles core operations:

addExpense()

viewExpenses()

editExpense()

deleteExpense()

calculateTotal()

3️⃣ Main

Console-based menu for user interaction

💻 Usage

Compile all files:

javac Main.java ExpenseTracker.java Expense.java


Run the application:

java Main


Use the menu:

1. Add Expense
2. View Expenses
3. Edit Expense
4. Delete Expense
5. Calculate total
6. Exit

📖 Example
Enter your choice: 1
Enter Date (YYYY-MM-DD): 2026-02-15
Enter Category: Food
Enter Description: Lunch at Cafe
Enter Amount: 250
Expense added successfully!

📄 License

This project is open-source and free to use for learning and personal purposes.
