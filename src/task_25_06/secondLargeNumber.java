package task_25_06;

import java.util.Arrays;

public class secondLargeNumber {
    public static void main(String args[]){
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);
        System.out.println(numbers[1]);//second smallest number
        System.out.println(numbers[numbers.length-2]);//second largest number
    }
}
