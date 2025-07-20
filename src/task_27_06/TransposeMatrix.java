package task_27_06;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matrix row len: ");
        int row = sc.nextInt();
        System.out.print("Enter the Matrix column len: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Enter the input for row %d and column %d: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        transpose(arr);
    }

    static void transpose(int[][] arr){
        int row = arr[0].length;
        int column = arr.length;
        int[][] transpose_arr = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose_arr[i][j] = arr[j][i];
            }
        }

        System.out.println(Arrays.deepToString(transpose_arr));
    }
}
