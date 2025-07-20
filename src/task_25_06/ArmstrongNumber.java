package task_25_06;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int count_digit = Integer.toString(num).length();
        int sum = 0;

        while(original > 0){
            sum =  sum + (int)Math.pow(original%10,count_digit);
            original = original/10;
        }

        if(sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
