package Re_exam_21_06;

import java.util.Scanner;

public class Challenge_11_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
