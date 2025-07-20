package exam_06_19;

import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args) {
        /*
        * **Requirements:**
        - Use +, -, *, /, % operators
        - Demonstrate assignment operators (=, +=, -=, *=, /=)
        - Show the results of each operation
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();
        System.out.println("Enter Var 2: ");
        int var2 = sc.nextInt();

        System.out.println("Addition: "+ (var1+var2));
        System.out.println("Subtraction: "+ (var1-var2));
        System.out.println("Multiplication: "+ (var1*var2));
        System.out.println("Division: "+ (var1/var2));
        System.out.println("Modulus: "+ (var1%var2));

    }
}
