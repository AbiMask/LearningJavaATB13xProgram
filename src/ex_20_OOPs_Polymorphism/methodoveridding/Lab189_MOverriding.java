package ex_20_OOPs_Polymorphism.methodoveridding;

import java.util.function.DoublePredicate;

public class Lab189_MOverriding {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animals makes sounds !!");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Barks !!");
    }

    void methodOverLoad(){
    }

    void methodOverLoad(int a){
    }
}