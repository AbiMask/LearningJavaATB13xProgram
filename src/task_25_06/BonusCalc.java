package task_25_06;

import java.util.Scanner;

public class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        double salary = sc.nextFloat();
        System.out.println("Enter the Year joined: ");
        int year = sc.nextInt();

        double Bonus_1to3 = 0.05;
        double Bonus_4to6 = 0.10;
        double Bonus_6 = 0.15;



        int current_year = 2025;
        int exp = current_year - year;

        if(year < 0)
            System.out.println("Invalid Year Input");
        else if(exp < 0)
            System.out.println("Entered the Year greater than current Year");
        else if(exp < 1)
            System.out.println("No Bonus");
        else if(exp <= 3)
            System.out.println(salary*(1+Bonus_1to3));
        else if(exp <= 6)
            System.out.println(salary*(1+Bonus_4to6));
        else
            System.out.println(salary*(1+Bonus_6));
    }
}
