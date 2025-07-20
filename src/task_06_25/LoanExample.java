package task_06_25;

import java.util.Scanner;

public class LoanExample {
    public static void main(String[] args) {
        final int MIN_AGE = 18;
        final int MAX_AGE = 80;
        final double MIN_SALARY = 30000;
        final int MIN_CREDIT_SCORE = 650;
        final int MAX_CREDIT_SCORE = 850;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the credit score: ");
        int creditScore = sc.nextInt();

        // Validation
        if (age <= 0) {
            System.out.println("Invalid input: Age must be a positive number.");
        } else if (age < MIN_AGE || age > MAX_AGE) {
            System.out.println("Ineligible: Age must be between " + MIN_AGE + " and " + MAX_AGE + ".");
        } else if (salary <= 0) {
            System.out.println("Invalid input: Salary must be a positive number.");
        } else if (salary < MIN_SALARY) {
            System.out.println("Ineligible: Salary must be at least " + MIN_SALARY + ".");
        } else if (creditScore <= 0) {
            System.out.println("Invalid input: Credit score must be a positive number.");
        } else if (creditScore < MIN_CREDIT_SCORE || creditScore > MAX_CREDIT_SCORE) {
            System.out.println("Ineligible: Credit score must be between " + MIN_CREDIT_SCORE + " and " + MAX_CREDIT_SCORE + ".");
        } else {
            System.out.println("You are eligible for the loan ✅");
        }

        sc.close();


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the Credit score: ");
        int credit_score = sc.nextInt();

        if(age>=18 && age<=80 && salary>=30000 && credit_score>=650 && credit_score<850)
            System.out.println("You are eligible for loan");
        else
            System.out.println("You are not eligible for loan");*/
    }
}
