package task_07_02;

public class VehicleConstructorChain {
    public static void main(String[] args) {
       Bike platina = new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is Ready!!");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is Ready!!");
    }
}
