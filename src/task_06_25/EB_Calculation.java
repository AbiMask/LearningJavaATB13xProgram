package task_06_25;

import java.util.Scanner;
import java.lang.Math;

public class EB_Calculation {
    public static void main(String[] args) {
        float rate_100 = 0.50F;
        float rate_101to200 = 0.750F;
        float rate_201to300 = 1.20F;
        float rate_above_300 = 1.50F;
        float final_bill;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        float units = sc.nextFloat();
        if (units < 0) {
            System.out.println("Invalid input. Units cannot be negative.");
            return;
        }


        if(units <= 100)
            final_bill = units*rate_100;
        else if(units<=200)
            final_bill = 100*rate_100 + (units-100)*rate_101to200;
        else if(units<=300)
            final_bill = 100*rate_100 + 100*rate_101to200 + (units-200)*rate_201to300;
        else
            final_bill = 100*rate_100 + 100*rate_101to200 + 100*rate_201to300 +  (units-300)*rate_above_300;

        System.out.println("Your bill amount is: " + Math.round(final_bill));
    }
}
