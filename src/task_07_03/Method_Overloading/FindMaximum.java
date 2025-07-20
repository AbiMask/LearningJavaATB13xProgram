package task_07_03.Method_Overloading;

public class FindMaximum {
    public static void main(String[] args) {
        Utility ul = new Utility();
        System.out.println(ul.max(12,24));
        System.out.println(ul.max(123,1122,2124));
    }


}

class Utility {
    int max(int a, int b){
        return Math.max(a, b);
    }

    int max(int a, int b, int c){
        return a>b && a>c ? a : b>c ? b : c;
    }
}