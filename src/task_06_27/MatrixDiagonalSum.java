package task_06_27;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matrix row len: ");
        int row = sc.nextInt();
        System.out.print("Enter the Matrix column len: ");
        int col = sc.nextInt();

        if (row != col) {
            System.out.println("Diagonal sum is only applicable for square matrices.");
            return;
        }

        int[][] arr = new int[row][col];
        int sum=0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Enter the input for row %d and column %d: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] val : arr) {
            for (int val1 : val) {
                System.out.print(val1 + "\t");
            }
            System.out.println();
        }

        //System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j)
                    sum += arr[i][j];
            }
        }


        System.out.println("Sum of Diagonal is: "+sum);
    }
}
