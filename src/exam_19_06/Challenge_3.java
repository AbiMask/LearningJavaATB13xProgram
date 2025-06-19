package exam_19_06;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        /*
        * **Requirements:**
        - Use comparison operators (==, !=, <, >, <=, >=)
        - Use logical operators (&&, ||, !)
        - Print boolean results with explanatory messages
        * */

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
