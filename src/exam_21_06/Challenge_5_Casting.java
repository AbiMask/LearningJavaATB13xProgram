package exam_21_06;

import java.util.Scanner;

public class Challenge_5_Casting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();
        System.out.println("Enter Var 2: ");
        float var2 = sc.nextFloat();

        System.out.println("Expression Result: "+(int)((var1+var2)+var1));
        System.out.println("Implicit casting: "+(var1+var2));
        System.out.println("Explicit casting: "+ (int)(var1+ (int)var2));
    }
}
