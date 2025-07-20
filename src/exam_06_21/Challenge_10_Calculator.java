package exam_06_21;

import java.util.Scanner;

public class Challenge_10_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        float num1 = sc.nextFloat();

        System.out.println("Enter the number 2:");
        float num2 = sc.nextFloat();

        System.out.println("Enter the operator to perform operation:");
        char op = sc.next().charAt(0);

        switch (op){
            case '+':{
                System.out.println("Result: "+(num1+num2));
                break;
            }
            case '-':{
                System.out.println("Result: "+(num1-num2));
                break;
            }
            case '*':{
                System.out.println("Result: "+(num1*num2));
                break;
            }
            case '/':{
                if(num2 != 0)
                    System.out.println("Result: "+(num1/num2));
                else
                    System.out.println("Error: Division by zero");

                break;
            }
            default:{
                System.out.println("Invalid operator");
                break;
            }
        }

    }
}
