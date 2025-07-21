package task_07_04;

public class Program2 {
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.method();
    }
}

class Mother{
    void method(){
        System.out.println("I'm method of Mother");
    }
}

class Daughter extends Mother{
    Daughter(){
        super.method();
    }

    void test(){
        super.method();
    }
}