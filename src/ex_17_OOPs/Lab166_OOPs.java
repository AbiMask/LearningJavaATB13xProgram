package ex_17_OOPs;

public class Lab166_OOPs {
    public static void main(String[] args) {

        Person abi = new Person(); //Creation of Object abi

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
