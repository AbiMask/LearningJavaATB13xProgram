package exam_06_21;

import java.util.Scanner;

public class Challenge_8_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = sc.nextInt();

        if(year%400 == 0 || (year%4 ==0 && year%100 != 0)){
            System.out.println(year+" is a leap year");
        }
        else System.out.println(year+" is not a leap year");
    }
}
