package task_07_03.Method_Overloading;

public class MultiplyNumbers {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println(m.multiply(1,5));
        System.out.println(m.multiply(11,5,4));
    }
}

class MathOperations{
    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b, int c){
        return a*b*c;
    }
}
