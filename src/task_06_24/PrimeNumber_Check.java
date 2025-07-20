package task_06_24;

import java.util.Scanner;

public class PrimeNumber_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num==1)
            System.out.println(num+" neither a prime nor composite");
        else{
            for (int i=2; i<=Math.sqrt(num);i++){
                if(num%i == 0) {
                    isPrime = false;
                    System.out.println(num+" is not a prime");
                    break;
                }
            }
            if(isPrime)
                System.out.println(num+" is a prime");

        }



    }
}
