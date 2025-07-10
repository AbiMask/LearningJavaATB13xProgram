package ex_16_Arrays;

import java.util.Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        int[] rev_arr = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            rev_arr[j] = arr[i];
            j++;
        }
        System.out.println("Array reversal using new array: " + Arrays.toString(rev_arr));


        int k=0;
        for(int i=arr.length-1; i>=arr.length/2; i--){
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k]= temp;
            k++;
        }

        System.out.println("Array reversal using existing array: " + Arrays.toString(arr));

    }
}
