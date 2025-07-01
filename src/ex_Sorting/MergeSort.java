package ex_Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,2,0,10};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if(start>=end)
            return;
        int mid = (start+end)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] left = new int[mid-start+1];
        int[] right = new int[end - (mid+1) +1];

        for(int i=0; i<left.length; i++){
            left[i] = arr[start+i];
        }

        for(int j=0; j<right.length; j++){
            right[j] = arr[mid+1+j];
        }
        int i = 0,j=0,k = start;

        while (i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
