package task_07_01;

public class DefaultConstructor {

    DefaultConstructor(){
        System.out.println("I'm your default constructor");
    }

    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();

        new DefaultConstructor();
    }
}
