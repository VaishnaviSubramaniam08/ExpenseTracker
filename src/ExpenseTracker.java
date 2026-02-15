import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    private ArrayList<Expense> expenses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

   
    public void addExpense() {
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = sc.next();
        System.out.print("Enter Category: ");
        String category = sc.next();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Description: ");
        String description = sc.nextLine();
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        expenses.add(new Expense(date, category, description, amount));
        System.out.println("Expense added successfully!");
    }


    public void viewExpenses() {
        if(expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        System.out.println("Index\tDate\t\tCategory\tDescription\tAmount");
        for(int i = 0; i < expenses.size(); i++) {
            Expense e = expenses.get(i);
            System.out.println(i + "\t" + e.getDate() + "\t" + e.getCategory() + "\t" + e.getDescription() + "\t" + e.getAmount());
        }
    }

  
    public void editExpense() {
        viewExpenses();
        if(expenses.isEmpty()) return;
        System.out.print("Enter the index of the expense to edit: ");
        int index = sc.nextInt();
        if(index < 0 || index >= expenses.size()) {
            System.out.println("Invalid index!");
            return;
        }
        sc.nextLine();
        System.out.print("Enter new Date (YYYY-MM-DD): ");
        String newDate = sc.nextLine();
        System.out.print("Enter new Category: ");
        String newCategory = sc.nextLine();
        System.out.print("Enter new Description: ");
        String newDesc = sc.nextLine();
        System.out.print("Enter new Amount: ");
        double newAmount = sc.nextDouble();

        Expense e = expenses.get(index);
        e.setDate(newDate);
        e.setCategory(newCategory);
        e.setDescription(newDesc);
        e.setAmount(newAmount);
        System.out.println("Expense updated successfully!");
    }

   
    public void deleteExpense() {
        viewExpenses();
        if(expenses.isEmpty()) return;
        System.out.print("Enter the index of the expense to delete: ");
        int index = sc.nextInt();
        if(index < 0 || index >= expenses.size()) {
            System.out.println("Invalid index!");
            return;
        }
        expenses.remove(index);
        System.out.println("Expense deleted successfully!");
    }

   
    public void calculateTotal() {
        if(expenses.isEmpty()) {
            System.out.println("No expenses to calculate.");
            return;
        }
        double total = 0;
        for(Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println("Total Expense: " + total);
    }
}