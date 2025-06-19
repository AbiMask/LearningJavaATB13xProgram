package exam_19_06;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        /*
        * **Requirements:**
- Show the difference between ++i and i++
- Show the difference between --i and i--
- Print values before and after operations
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int var = sc.nextInt();
        System.out.println("Original: "+ var);
        System.out.println("Pre-increment: "+(++var));
        System.out.println("Post-increment: "+(var++));
        System.out.println("Pre-decrement: "+(--var));
        System.out.println("Post-decrement: "+(var--));


    }
}
