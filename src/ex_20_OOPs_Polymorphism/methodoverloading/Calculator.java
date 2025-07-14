package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {

    public static void main(String[] args) {
        calc c = new calc();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.01,20.00));
        System.out.println(c.add(10,20,30));
    }
}


class calc{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

}