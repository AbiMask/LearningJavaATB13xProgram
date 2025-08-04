package ex_25_OOPs_Abstraction_Interface;

import java.security.cert.PolicyNode;

public class Lab198_Interface {
    public static void main(String[] args) {
        polygonal.complete3();
        square sq = new square();
        sq.getArea(10,10);
    }
}


class square implements polygonal{


    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area is :"+length*breadth);
    }
}



interface polygonal{
//    polygonal(){
//
//    } constructor not allowed in interface

//    void complete1(){
//
//    } concrete methods without default & static are not allowed

    void getArea(int length, int breadth);

    default void complete2(){
        System.out.println("Possible 2 - default");
    }

    static void complete3(){
        System.out.println("Possible 3 - static");
    }

}

abstract class A{
    abstract void a1();

    A(){
        System.out.println("Default constructor is possible in abstract");
    }

    void complete(){
        System.out.println("Complete in abstract class");
    }

}


class B extends A{

    @Override
    void a1() {
        System.out.println("I'm ovrriden abstract class from A");
    }

}