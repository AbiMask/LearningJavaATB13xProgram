package ex_22_OOPs_accessModifer;

public class Lab192 {
    public static void main(String[] args) {
        Son s = new Son();
    }
}

 class Father{
    public int gold = 100;
    int silver = 200;
    private int diamond = 300;

    public Father(){
        System.out.println("I'm Father DC");
    }

     Father(int a){
        System.out.println("I'm Father PC " + a);
    }
}

class Son extends Father{

    Son(){

        System.out.println("I'm son DC");

    }

    void new_method(){
        System.out.println(gold);
        System.out.println(silver);
        //System.out.println(diamond);
    }
}