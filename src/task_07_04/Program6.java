package task_07_04;

public class Program6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.doEat();
    }
}

class Animal {
    protected void eat(){
        System.out.println("Animal is eating!!");
    }
}

class Dog extends Animal{
    void doEat(){
        eat();
    }
}