package task_07_02;

public class AnimalSoundSimulator {

    public static void main(String[] args) {
        Cat julie = new Cat();
        julie.meow();
        julie.makeSound();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animals makes sound");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat says Meow!!");
    }
}