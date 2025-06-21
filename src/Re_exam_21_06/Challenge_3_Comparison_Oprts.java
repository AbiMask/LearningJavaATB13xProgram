package Re_exam_21_06;

import java.util.Scanner;

public class Challenge_3_Comparison_Oprts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var a: ");
        int a = sc.nextInt();
        System.out.println("Enter Var b: ");
        int b = sc.nextInt();

        System.out.println("a == b: "+ (a == b));
        System.out.println("a > b: "+ (a > b));
        System.out.println("a < b: "+ (a < b));
        System.out.println("(a > b) && (a > 0): "+ ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): "+ ((a < b) || (a > 0)));
        System.out.println("!(a > b): "+ (!(a > b)));

    }
}
