package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
