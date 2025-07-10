package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab150_Arrays {
    public static void main(String[] args) {
        //ways to declare arrays

        int[] marks = {10,30,40}; //size is not fixed

        String[] name = new String[3]; //size is fixed 3, 0 -> 2
        name[0] = "Abi";
        name[1] = "Subi";
        name[2] = "Mask";

        System.out.println(Arrays.toString(name));
        System.out.println(name[0]);
        System.out.println(name[1]);

        int[] marks2 = new int[4]; //size is fixed 4,0 -> 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+marks2.length+" to make them as array:");
        for (int i=0; i<marks2.length; i++){
            marks2[i] = sc.nextInt();
        }
        System.out.println("New Array is " + Arrays.toString(marks2));

    }
}
