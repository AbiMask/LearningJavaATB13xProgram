package task_06_25;

import java.util.Scanner;

public class Employee_Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Pay: ");
        double Basic_Pay = sc.nextDouble();
        System.out.println("Enter the HRA: ");
        double HRA = sc.nextDouble();
        System.out.println("Enter the DA: ");
        double DA = sc.nextDouble();
        System.out.println("Enter the Tax: ");
        double Tax = sc.nextDouble();
        System.out.println("Enter the PF: ");
        double PF = sc.nextDouble();

        double net_Salary;

        double gross_salary = Basic_Pay + HRA + DA;
        double deductions = Tax - PF;

        net_Salary = gross_salary - deductions;

        System.out.println("Your net Salary is: "+net_Salary);

    }
}
