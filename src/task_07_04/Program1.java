package task_07_04;

public class Program1 {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father{

    Father(String name){
        System.out.println("I'm Father's constructor: "+ name);
    }
}

class Son extends Father{
    Son(){
        super("Subi");
    }
}
