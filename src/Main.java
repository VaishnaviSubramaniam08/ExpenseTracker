import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ExpenseTracker tracker=new ExpenseTracker();
        int choice;
        do{
            System.out.println("\n --- Expense Tracker ---");
            System.out.println("1.Add Expense");
            System.out.println("2.View Expenses");
            System.out.println("3.Edit Expense");
            System.out.println("4.Delete Expense");
            System.out.println("5.Calculate total");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    tracker.addExpense();
                    break;
                case 2:
                    tracker.viewExpenses();
                    break;
                case 3:
                    tracker.editExpense();
                    break;
                case 4:
                    tracker.deleteExpense();
                    break;
                case 5:
                    tracker.calculateTotal();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            

            }

        }while(choice!=6);
    }
    }
