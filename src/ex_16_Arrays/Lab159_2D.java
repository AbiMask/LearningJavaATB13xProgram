package ex_16_Arrays;
import java.util.Arrays;
public class Lab159_2D {
    public static void main(String[] args) {
        int[][] two_arr = { {1,2,3},
                            {4,5,6}  } ;

        int[][] arr = new int[][]{  {1,1,1,241},
                                    {1,2,13,14},
                                    {1,123,324,234} };

        int[][] arr_2 = new int[2][2];

        arr_2[0][0] = 10;
        arr_2[0][1] = 20;
        arr_2[1][0] = 30;
        arr_2[1][1] = 40;


        System.out.println(Arrays.deepToString(two_arr));
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr_2));
    }
}
