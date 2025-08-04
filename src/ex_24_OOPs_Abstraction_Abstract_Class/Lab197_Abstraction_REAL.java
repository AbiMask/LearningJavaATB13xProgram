package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab197_Abstraction_REAL {
    public static void main(String[] args) {
        Company abc = new Company();
        double total = abc.computePay(12,1000);
        System.out.println(total);
    }
}

class Company extends Employee{
    @Override
    double computePay(int age, int salary) {
        return age*salary;
    }
}

abstract class Employee{
    private String name;
    private int age;
    private  double salary;

    Employee() {
        System.out.println("DC");
    }

    Employee(String name, int age, double salary) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    abstract double computePay(int age, int salary);

    void mailCheck(){
        System.out.println("Main is sent to "+this.name);
    }
}
