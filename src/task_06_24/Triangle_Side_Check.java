package task_06_24;

import java.util.Scanner;

public class Triangle_Side_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle: ");
        System.out.println("Side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Side 2: ");
        int side2 = sc.nextInt();
        System.out.println("Side 3: ");
        int side3 = sc.nextInt();

        if( (side1+side2)>side3 && (side2+side3)>side1 && (side3+side1)>side2)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
