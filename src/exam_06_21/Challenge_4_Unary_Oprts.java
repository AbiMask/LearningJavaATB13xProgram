package exam_06_21;

import java.util.Scanner;

public class Challenge_4_Unary_Oprts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int var = sc.nextInt();
        System.out.println("Original: "+ var);
        System.out.println("Pre-increment: "+(++var));
        System.out.println("Post-increment: "+(var++) + " (returned )"+ var);
        System.out.println("Pre-decrement: "+(--var));
        System.out.println("Post-decrement: "+(var--) + " (returned )"+ var);


    }
}
