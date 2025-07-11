package ex_19_OOps_Inheritance.hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Keerthi k1 = new Keerthi();

        k1.home();
        f1.home();

        Abi p1 = new Abi();
        p1.home();

        Subbi l1 = new Subbi();
        l1.s2();
        l1.home();

        Father f2 = new Subbi();    //Dynamic Dispatch
        f2.home();

    }
}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Abi extends Father{
    void h2(){
        System.out.println("h2 - Abi");
    }
}

class Subbi extends Father{

    void s2(){
        System.out.println("Subi");
    }

    void home(){
        System.out.println("h2 subi");
    }
}

class Keerthi extends Father {
    void k1(){
        System.out.println("Keerthi");
    }
}