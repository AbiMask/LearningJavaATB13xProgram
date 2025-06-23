package task_23_06;

import java.util.Scanner;

public class Vowel_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char var1 = sc.next().toLowerCase().charAt(0);

        if( var1 == 'a' ||
            var1 == 'e' ||
            var1 == 'i' ||
            var1 == 'o' ||
            var1 == 'u'
        )
            System.out.println(var1 + " is a vowel");
        else
            System.out.println(var1+ " is a consonant");



    }
}
