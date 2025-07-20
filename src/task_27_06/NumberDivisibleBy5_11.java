package task_27_06;

import java.util.Scanner;

public class NumberDivisibleBy5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean divisible_5=(num%5==0);
        boolean divisible_11=(num%11==0);

        if(divisible_5 && divisible_11)
            System.out.println(num + " is divisible by 5 and 11");
        else if(divisible_5)
            System.out.println(num + " is divisible only by 5");
        else if(divisible_11)
            System.out.println(num + " is divisible only by 11");
        else
            System.out.println(num + " is not divisible by 5 or 11");
    }
}
