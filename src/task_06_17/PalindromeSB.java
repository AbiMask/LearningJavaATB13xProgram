package task_06_17;

import java.util.Scanner;

public class PalindromeSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.next();

        StringBuffer bf = new StringBuffer(str);
        String rev_str = bf.reverse().toString();

        if(str.equalsIgnoreCase(rev_str))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
