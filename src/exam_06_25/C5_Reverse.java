package exam_06_25;

import java.util.Scanner;

public class C5_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse_SB(s));

    }

    public static String reverse_SB(String str){
        StringBuilder sb = new StringBuilder(str);
        str = String.valueOf(sb.reverse());
        return str;
    }

}
