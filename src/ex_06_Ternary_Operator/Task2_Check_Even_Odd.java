package ex_06_Ternary_Operator;

public class Task2_Check_Even_Odd {
    public static void main(String[] args) {
        int a = 6;
        String res = (a == 0) ? a+" is neither nor" : (a%2 == 0) ? a+" is even" : a+" is odd";
        System.out.println(res);
    }
}
