package ex_Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,2,0,10};
        int key;
        int j;

        for(int i=1; i<arr.length; i++){
            key = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>=key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }


}
