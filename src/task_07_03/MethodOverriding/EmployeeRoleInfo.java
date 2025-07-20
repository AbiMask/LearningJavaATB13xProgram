package task_07_03.MethodOverriding;

public class EmployeeRoleInfo {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.role();

        Tester tester = new Tester();
        tester.role();

        Clerk clerk = new Clerk();
        clerk.role();
    }
}

class Employee {
    void role(){
        System.out.println("General Employees");
    }
}

class Manager extends Employee{
    void role(){
        System.out.println("Manager");
    }
}

class Clerk extends Employee{
    void role(){
        System.out.println("Clerk");
    }
}

class Tester extends Employee{
    void role(){
        System.out.println("Tester");
    }
}