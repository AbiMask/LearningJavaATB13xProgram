package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("Abi", 97654321, "abc");
        System.out.println(p1.name);
        Person p2 = new Person("Subi", 98989898, "XYZ");
    }
}

class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;

    }
    Person(String name_user,long phone_user) {
        this.name = name_user;
        this.phone = phone_user;

    }

}