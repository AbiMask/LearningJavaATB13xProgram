package task_07_03.Method_Overloading;

public class GreetUser {
    public static void main(String[] args) {
        Greeter user = new Greeter();
        user.greet();
        user.greet("Abi");
    }
}

class Greeter {
    void greet(){
        System.out.println("Hello!");
    }
    void greet(String name){
        System.out.println("Hello!" + name);
    }
}
