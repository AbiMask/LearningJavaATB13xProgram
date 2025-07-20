package task_06_23;

import java.util.Scanner;

public class Positive_Number_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();

        if(var1 == 0){
            System.out.println(var1+" is zero");
        }
        else if (var1>0) {
            System.out.println(var1+" is positive");
        }
        else if (var1<0) {
            System.out.println(var1+" is negative");
        }
        else{
            System.out.println("Incorrect Input");
        }
    }

}
