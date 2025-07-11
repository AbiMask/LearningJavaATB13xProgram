package ex_19_OOps_Inheritance.single_inheritance;

public class Lab180_Inheritance {
    public static void main(String[] args) {
        Father magi = new Father();
        magi.bhk_2();
        System.out.println(magi.gold);
        //magi.bhk_3()                      Cannot use the method of child


        Son abi = new Son();                //Son can use father's attributes and functions
        abi.bhk_3();
        abi.bhk_2();
        System.out.println(abi.gold);
    }
}

class Father{
    int gold = 1000;    // Attribute | Data variables |  Property | Instance Variables
    void bhk_2(){       //  Behaviour |  Method | Function | Data members
        System.out.println("Father House - 2 HBK");
    }
}

class Son extends Father{
    void bhk_3(){
        System.out.println("Son House - 3 BHK");
    }
}
