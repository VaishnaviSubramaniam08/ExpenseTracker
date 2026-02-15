##Expense Tracker

A simple Java console application to manage and track personal expenses. Users can add, view, edit, delete expenses, and calculate the total amount spent.

Features

Add Expense – Input date, category, description, and amount.

View Expenses – Display a list of all expenses with details.

Edit Expense – Update any expense entry by its index.

Delete Expense – Remove an expense by its index.

Calculate Total – Show the total of all recorded expenses.

Technologies Used

Language: Java

Data Structure: ArrayList to store expenses

Input Handling: Scanner for user input

Classes Overview
1. Expense

Represents a single expense with the following attributes:

date – Date of the expense (YYYY-MM-DD)

category – Expense category (e.g., Food, Transport)

description – Brief description of the expense

amount – Expense amount

Includes getters and setters for all fields.

2. ExpenseTracker

Handles operations related to managing expenses:

addExpense() – Add a new expense

viewExpenses() – List all expenses

editExpense() – Modify an existing expense

deleteExpense() – Remove an expense

calculateTotal() – Calculate total expense

3. Main

Provides a console menu for the user to interact with the Expense Tracker.

Usage

Compile all Java files:

javac Main.java ExpenseTracker.java Expense.java


Run the application:

java Main


Use the menu to perform operations:

Press 1 to add a new expense.

Press 2 to view all expenses.

Press 3 to edit an expense.

Press 4 to delete an expense.

Press 5 to calculate the total expense.

Press 6 to exit the program.

Example
 --- Expense Tracker ---
1.Add Expense
2.View Expenses
3.Edit Expense
4.Delete Expense
5.Calculate total
6.Exit
Enter your choice: 1
Enter Date (YYYY-MM-DD): 2026-02-15
Enter Category: Food
Enter Description: Lunch at Cafe
Enter Amount: 250
Expense added successfully!

License

This project is open source and free to use for learning and personal purposes.
