package task_06_25;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age<0){
            System.out.println("Age should not be in negative");
            return;
        }

        System.out.println("Enter the Visa Status Valid/Invalid: ");
        String visa_status = sc.next();
        if(!visa_status.equalsIgnoreCase("valid") && !visa_status.equalsIgnoreCase("invalid")){
            System.out.println("Entered a incorrect visa status");
            return;
        }

        if(age>=18 && visa_status.equalsIgnoreCase("valid"))
            System.out.println("User can travel");
        else
            System.out.println("User cannot travel");


    }
}
