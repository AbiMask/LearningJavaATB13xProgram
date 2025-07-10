package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.year);
        System.out.println(c.model);

        Baby1 b = new Baby1();
        b.name = "Tharigs";
        System.out.println(b.name);
    }
}

class Car {
    String name;
    int year;
    String model;

    // DC
    Car(){
        name = "Unknown Car";
        year = 1991;
        model =  "XXX";
    }

}

class Baby1{
    String name;

    Baby1(){
        name = "Gugu";
    }
}