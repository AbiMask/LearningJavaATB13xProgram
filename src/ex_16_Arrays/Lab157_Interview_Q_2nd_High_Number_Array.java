package ex_16_Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] arr = {34,13,145};

        // Initialize the highest and second highest to the minimum possible value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        System.out.println(first + " "+second);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                // Update second highest before updating the highest
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                // Update second highest if the current element is not equal to the highest
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number.");
        } else {
            System.out.println("The second highest number is: " + second);
        }
    }
}
