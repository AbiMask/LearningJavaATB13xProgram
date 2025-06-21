package Re_exam_21_06;

import java.util.Scanner;

public class Challenge_2_Arithmetic_Oprts {
    public static void main(String[] args) {

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
