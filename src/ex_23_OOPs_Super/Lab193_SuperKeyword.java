package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
}

 class Vehicle{
    int max_speed = 100;

     Vehicle(){
         System.out.println("Default Constructor of Vehicle Class");
     }

     Vehicle(int a){
         System.out.println("Parameterized Constructor of Vehicle Class");
     }

     void message(){
         System.out.println("Type1");
     }

     void message(int a){
         System.out.println("Type2");
     }

     int message(String a){
         System.out.println("Type3");
         return 0;
     }

     int message(int a, int b){
         System.out.println("Type4");
         return a+b;
     }

     void display(){
         System.out.println("Vehicle Parent");
     }
}

class Car extends Vehicle{

}