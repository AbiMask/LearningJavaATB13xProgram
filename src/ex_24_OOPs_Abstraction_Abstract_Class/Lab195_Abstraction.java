package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        Father f = new Son();
        f.loan25k();
        f.loan50k();

        Son s = new Son();
        s.loan50k();
        s.loan25k();

       // Father f1 = new Father(); //This is a abstract class
    }
}

class Car{
    // This is concreate class
    // this doesn't have the abstract methods
    void done(){
    }
}

abstract class Father{
    //This is called abstract class
    abstract void loan50k();

    //as a complete function
    void loan25k(){
        System.out.println("Father paid loan of 25k");
    }
}

class Son extends Father{

    @Override
    void loan50k (){
        System.out.println("Father, don't worry, I will pay the loan of 50k");
    }
}