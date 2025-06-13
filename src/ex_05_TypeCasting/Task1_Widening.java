package ex_05_TypeCasting;

public class Task1_Widening {
    public static void main(String[] args) {
        int A = 100;
        double D = A;
        double D1 = (double) A;
        System.out.println(D);
        System.out.println(D1);
    }
}
