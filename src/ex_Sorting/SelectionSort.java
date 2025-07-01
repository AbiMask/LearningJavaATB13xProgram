package ex_Sorting;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,2,0,10};
        int temp;

        for(int i=0; i<arr.length; i++){
            int minindex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minindex] > arr[j]){
                    minindex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
