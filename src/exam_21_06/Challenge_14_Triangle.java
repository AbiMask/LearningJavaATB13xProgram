package exam_21_06;

import java.util.Scanner;

public class Challenge_14_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        System.out.println("Right Triangle:");
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pyramid:");
        for (int i = 1; i <= num ; i++) {
            for (int j = i; j <=num-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
