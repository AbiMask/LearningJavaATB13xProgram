package task_07_03.Method_Overloading;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Calculator addition = new Calculator();
        System.out.println(addition.add(10,40));
        System.out.println(addition.add(123.123,1324.134));
    }
}

class Calculator {
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}