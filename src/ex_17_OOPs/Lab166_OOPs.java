package ex_17_OOPs;

public class Lab166_OOPs {
    public static void main(String[] args) {

        Person abi = new Person(); //Creation of Object abi

        //Person - Class - will lod in Class Loader
        //abi - Object Reference
        //new Person() - Object

        abi.walk();
        abi.eat("Dosa");
        abi.sleep();
        abi.food(10);

        Person p1 = new Person(); //Creation of another object p1
        p1.walk();
        p1.sleep();
        p1.eat("Idly");
    }
}
