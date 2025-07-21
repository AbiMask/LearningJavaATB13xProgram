package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        F1Car car = new F1Car("Magesh");
        car.message(10);
    }
}

class Vehicle{
    public int max_speed = 200;

    Vehicle(){
        System.out.println("I'm Vehicle DC");
    }

    Vehicle(String a){
        System.out.println("I'm Vehicle PC with value: "+a);
    }

    void message(){
        System.out.println("I'm Vehicle class message method");
    }

    void message(int a){
        System.out.println("I'm Vehicle class message method with value: "+a);
    }
}

class F1Car extends Vehicle{
    public int max_speed = 100;
    F1Car(){
        //super();
        this("Subishek");
    }

    F1Car(String a){
        super("Abishek " + a);
    }

    void message(int a){
        System.out.println("I'm Vehicle class message method with value: "+ a +" " +super.max_speed);
    }

}