package exam_19_06;

import java.util.Scanner;

public class Challenge_5 {
    public static void main(String[] args) {
        /*
        * **Requirements:**
- Show operator precedence with complex expressions
- Demonstrate implicit and explicit type casting
- Print results with explanations
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();
        System.out.println("Enter Var 2: ");
        float var2 = sc.nextFloat();


        System.out.println("Implicit casting: "+(var1+var2));
        System.out.println("Explicit casting: "+ (int)(var1+ (int)var2));
    }
}
