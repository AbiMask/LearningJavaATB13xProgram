package task_27_06;

import java.util.Scanner;

public class ConvertDaysToYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days: ");
        int num = sc.nextInt();

        int year = num / 365;
        num = num % 365;

        int month = num / 30;

        int day = num % 30;

        System.out.printf("%d Year%s, %d Month%s, %d Day%s%n",
                year, (year == 1 ? "" : "s"),
                month, (month == 1 ? "" : "s"),
                day, (day == 1 ? "" : "s"));


    }
}
