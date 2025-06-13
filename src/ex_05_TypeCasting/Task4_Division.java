package ex_05_TypeCasting;

public class Task4_Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        float res = (float)a/ (float)b;
        float res1 = (float) a/b;
        float res2 = a/(float) b;
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
