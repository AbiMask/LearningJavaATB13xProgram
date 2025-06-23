package task_23_06;

import java.util.Scanner;

public class Min_Two_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();
        System.out.println("Enter Var 2: ");
        int var2 = sc.nextInt();

        if (var1 < var2) {
            System.out.println(var1 + " is the smallest");
        } else if (var2 > var1) {
            System.out.println(var2 + " is the smallest");
        } else {
            System.out.println("Both are equal");
        }

    }

}
