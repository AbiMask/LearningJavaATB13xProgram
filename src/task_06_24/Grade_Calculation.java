package task_06_24;

import java.util.Scanner;

public class Grade_Calculation {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks between 0 to 100: ");
        int marks = sc.nextInt();

        if(marks>=0 && marks<=100){
            if(marks>=90)
                System.out.println("A+");
            else if (marks>=80)
                System.out.println("A");
            else if (marks>=70)
                System.out.println("B");
            else if (marks>=60)
                System.out.println("C");
            else if (marks>=50)
                System.out.println("D");
            else if (marks>=40)
                System.out.println("E");
            else
                System.out.println("Fail");
        }
        else
            System.out.println("User enetered a mark which is not b/w 0 to 100");
    }
}
