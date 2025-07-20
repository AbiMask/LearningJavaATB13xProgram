package task_07_03.Method_Overloading;

public class PrintData {
    public static void main(String[] args) {
        Printer print = new Printer();
        print.printData();
        print.printData("Abishek");
        print.printData(12);
        print.printData(12.12F);
    }
}

class Printer{
    void printData(){
        System.out.println("Nothing to print");
    }
    void printData(String data){
        System.out.println(data);
    }
    void printData(int data){
        System.out.println(data);
    }
    void printData(float  data){
        System.out.println(data);
    }


}
