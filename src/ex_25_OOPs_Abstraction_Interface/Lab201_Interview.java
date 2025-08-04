package ex_25_OOPs_Abstraction_Interface;

public class Lab201_Interview {
}

interface I11{}
interface I12{}
class A1{}
class B1{}
abstract class Pramod{
    abstract void pp();
}

//interface K implements I11{} Not possible interface cannot implements interface

class AB extends A1{}
class AC implements I11{}
class AD implements I11,I12{}
class AE extends B1 implements I11,I12{}
//class AG implements I11 extends A1 {}  class should extends and then implements
//class AG extends A1, B1{}     multiple inheritance is not allowed in extends
//interface I3 extends A1{}
interface I3{}
interface I4{
    static void a1(){}
    default void a2(){}
    void a3();
//    void concrete(){
//
//    }

}
