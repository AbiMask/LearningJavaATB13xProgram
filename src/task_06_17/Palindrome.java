package task_06_17;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.next();
        boolean isPalin = true;

        int j=str.length()-1;
        for(int i=0; i<str.length()/2; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                isPalin = false;
                break;
            }
        }

        if(isPalin)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
