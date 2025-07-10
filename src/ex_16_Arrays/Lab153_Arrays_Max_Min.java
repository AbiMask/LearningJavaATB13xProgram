package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] arr = {234,1,13,14,14,5245,245};

        /*
        Arrays.sort(arr);
        System.out.println("Min: "+arr[0]);
        System.out.println("Max: "+arr[arr.length-1]);
         */

        int min_value = get_min(arr);
        int max_value = get_max(arr);
        System.out.println("Min: "+min_value);
        System.out.println("Max: "+max_value);
    }

    static int get_min(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
        }

        return min;
    }

    static int get_max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
                 max = arr[i];
        }

        return max;
    }
}
