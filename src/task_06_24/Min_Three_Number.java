package task_06_24;

import java.util.Scanner;

public class Min_Three_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Var 1: ");
        int var1 = sc.nextInt();
        System.out.println("Enter Var 2: ");
        int var2 = sc.nextInt();
        System.out.println("Enter Var 3: ");
        int var3 = sc.nextInt();

        if(var1<=var2 && var1<=var3){
            System.out.println("Smallest number is: "+var1);
        }
        else if(var2<=var3){
            System.out.println("Smallest number is: "+var2);
        }
        else{
            System.out.println("Smallest number is: "+var3);
        }
    }
}

