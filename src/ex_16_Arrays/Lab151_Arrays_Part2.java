package ex_16_Arrays;

import java.util.Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names =  {"abi","subi","mask"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);


        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;

        System.out.println(Arrays.toString(is_male_data));
    }
}
