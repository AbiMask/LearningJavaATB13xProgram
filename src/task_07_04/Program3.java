package task_07_04;

public class Program3 {
    public static void main(String[] args) {
        Person p = new Person();
    }
}

class God{
    String s = "Amen!!";
}

class Person extends God{
    Person(){
        System.out.println(super.s);
    }
}