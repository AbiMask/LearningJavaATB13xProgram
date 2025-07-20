package task_07_03.MethodOverriding;

public class VehicleStart {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        car.start();
        bike.start();

        //Dynamic Dispatch
        Vehicle car1 = new Car();
        car1.start();

    }
}

class Vehicle {
    void start(){
        System.out.println("Start your vehicle");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Turn the key to start the car");
    }
}