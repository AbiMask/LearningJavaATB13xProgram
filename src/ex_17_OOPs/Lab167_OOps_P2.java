package ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student(); //Calls only the constructor
        new Student().sleep(); //Calls constructor and method sleep

    }
}

class Student{
    String name;

    // is called as the default constructor, same name as the class name.
    Student(){
        System.out.println("Default Constructor");
    }



    void sleep(){
        System.out.println("Hi, you are calling sleep method");
    }

}
