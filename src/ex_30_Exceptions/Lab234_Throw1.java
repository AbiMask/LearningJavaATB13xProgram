package ex_30_Exceptions;

import java.util.Scanner;

public class Lab234_Throw1 {
    public static void main(String[] args) throws DivisibleByZero {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divisible number");
        int a = sc.nextInt();

        try {
            int b = 100 / a;
            System.out.println(b);
        } catch (Exception e) {
            throw new DivisibleByZero("Abi");
        }
    }
}

class DivisibleByZero extends Exception{
    DivisibleByZero(String s){
        super(s);
    }
}
