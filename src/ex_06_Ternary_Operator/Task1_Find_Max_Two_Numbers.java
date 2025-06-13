package ex_06_Ternary_Operator;

public class Task1_Find_Max_Two_Numbers {
    public static void main(String[] args) {
        int a = 70;
        int b = 70;
        int max = (a >= b) ? a : b;
        System.out.println(max);

        System.out.println(a>=b ? a+" is the largest" : b+" is the largest");
    }
}
