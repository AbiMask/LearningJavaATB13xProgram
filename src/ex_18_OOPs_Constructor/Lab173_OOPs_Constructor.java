package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        child c = new child();
    }
}

class child{
    //attributes, properties, variables
    String name;

    //Default Constructor
    child(){
        System.out.println("I'm your constructor");
    }

    //Behaviour, Functions, Methods
    void sleep(){
        System.out.println("sleeping!!");
    }

    void walk(){
        System.out.println("walking!!");
    }

}