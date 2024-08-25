import java.util.Scanner;

public class testing {

    public static final Scanner input = new Scanner(System.in);
    public static final double INCOME_TAX = 0.13;
    public static final double EI_RATE = 0.0;
    public static final double CPP_RATE = 0.0;
    public static final String SOI_FILEPATH = "";
    public static final String EXPENSE_FILEPATH = "";
    public static final String SHIFT_FILEPATH = "";
    public static final double SAVING_PERCENTAGE = 0.65;

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE AMAZING FINANCES TRACKER!");
        System.out.println("WHAT FUNCTION WOULD YOU LIKE TO CARRY OUT?");
        System.out.println("""
                1: EDIT/UPDATE SOURCES OF INCOME
                2: EDIT/UPDATE EXPENSES
                3: EDIT FINANCE CONSTANTS
                4: LOG NEW PAYCHECK
                5: LOG SHIFT
                6: DAILY STATUS REPORT""");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("WOULD YOU LIKE TO " +
                    "1: ADD SOURCE OF INCOME" +
                    "2: REMOVE SOURCE OF INCOME" +
                    "3: LIST SOURCES OF INCOME");
        } else if (choice == 2) {
            System.out.println("WOULD YOU LIKE TO " +
                    "1: ADD A RECURRING EXPENSE" +
                    "2: REMOVE A RECURRING EXPENSE" +
                    "3: LIST ALL EXPENSES");
        } else if (choice == 3) {
            System.out.println("WOULD YOU LIKE TO " +
                    "1: ADD FINANCE CONSTANT" +
                    "2: REMOVE FINANCE CONSTANT" +
                    "3: LIST ALL FINANCE CONSTANTS");
        } else if (choice == 4) {
            System.out.println("WHAT SOURCE OF INCOME IS THIS FROM?");
            // List out all sources of income
            int SOI = input.nextInt();

            System.out.println("HOW MUCH IS THE PAYCHECK FOR?");
            int paystub = input.nextInt();

            System.out.println("WHEN DID YOU GET THIS PAYCHECK?");
            int depositDate = input.nextInt();

            // Insert data into corresponding files
            // List all relevant information on spending paycheck
        } else if (choice == 5) {
            System.out.println("WHERE WAS THIS SHIFT COMPLETED?");
            // List out all sources of income
            int company = input.nextInt();

            System.out.println("HOW LONG DID YOU WORK FOR?");
            int hoursWorked = input.nextInt();

        } else if (choice == 6) {
            
        }

    }

}


