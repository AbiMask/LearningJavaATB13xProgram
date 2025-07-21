package task_07_04;

public class Program5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.showDetails();

        TestDefault td = new TestDefault();
        td.showDetails();
    }
}

class Student {
    void showDetails(){
        System.out.println("I can shwo the details");
    }
}

class TestDefault extends  Student{

}