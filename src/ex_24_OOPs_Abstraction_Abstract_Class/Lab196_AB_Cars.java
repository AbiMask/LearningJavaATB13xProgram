package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        Wagnor wg = new Wagnor();
        wg.drive();
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void checkEngine(){
        System.out.println("Everything is Good");
    }
}

class Wagnor extends Engine{

    @Override
    void startEngine() {
        System.out.println("Engine Starts");
    }

    @Override
    void stopEngine() {
        System.out.println("Engine stops");
    }

    void drive()
    {
        checkEngine();
        startEngine();
        stopEngine();
    }
}