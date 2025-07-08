package ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();

        if(str.equals(reverseString(str)))
            System.out.println("Palindrome 1");
        else
            System.out.println("Not Palindrome 1");

        if(str.equals(reverseStringBuilder(str)))
            System.out.println("Palindrome 2");
        else
            System.out.println("Not Palindrome 2");
    }

    public static String reverseString(String str){
        String rev_str = "";
        for(int i=str.length()-1; i>=0; i--){
            rev_str += str.charAt(i);
        }
        //System.out.println("Rev String: "+rev_str);

        return rev_str;

    }

    public static String reverseStringBuilder(String str){

        StringBuilder sb = new StringBuilder(str);
        //System.out.println("SB reverse :" + sb.reverse().toString());
        return sb.reverse().toString();

    }

}
