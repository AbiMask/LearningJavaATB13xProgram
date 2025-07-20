package task_07_03.MethodOverriding;

public class AnimalSounds {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Cow cow = new Cow();
        cow.sound();

        Animal animal = new Animal();
        animal.sound();
    }
}

class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal{
    void sound(){
        System.out.println("Moo");
    }
}