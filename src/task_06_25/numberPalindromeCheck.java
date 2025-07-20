package task_06_25;

import java.util.Scanner;

public class numberPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int originalNumber = sc.nextInt();

        int num = originalNumber;
        int reversedNumber = 0;
        while (num >  0){
            reversedNumber = reversedNumber*10 + num%10;
            num = num/10;
        }

//        System.out.println(reversedNumber);
//        System.out.println(originalNumber);
        if(originalNumber == reversedNumber){
            System.out.println("Palidrome");
        }
        else
            System.out.println("Not a Palindrome");

    }
}
