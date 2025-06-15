package ex06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        System.out.println("I captured your input");

        System.out.println("Your age is "+age);

        String canIVote = age < 18? "no" : "yes";
        System.out.println(canIVote);
    }
}
