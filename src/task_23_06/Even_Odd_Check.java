package task_23_06;

import java.util.Scanner;

public class Even_Odd_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();

        if(var1%2 == 0){
            System.out.println(var1+" is even");
        }
        else{
            System.out.println(var1+" is odd");
        }
    }
}
