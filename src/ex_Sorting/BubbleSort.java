package ex_Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {10, 7, 6, 5, 3, 4};
        int temp;

        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                System.out.println("No swap happened at iteration: " + i);
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}

