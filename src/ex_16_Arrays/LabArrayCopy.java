package ex_16_Arrays;

import java.util.Arrays;

public class LabArrayCopy {
    public static void main(String[] args) {
        int[] org = new int[] {1,2,4};
        int[] copy = new int[org.length];

        System.arraycopy(org,1,copy,0,2);
        System.out.println(Arrays.toString(copy));
    }
}
