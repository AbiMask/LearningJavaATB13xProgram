package task_25_06;



public class secondLargeNumberWithoutArrays {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] != largest ){
                second_largest = arr[i];
            }
        }

        System.out.println(largest + " is the largest");
        System.out.println(second_largest + " is the 2nd largest");

    }

}
