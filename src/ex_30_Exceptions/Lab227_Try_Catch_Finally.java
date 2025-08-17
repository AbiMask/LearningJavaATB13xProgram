package ex_30_Exceptions;

public class Lab227_Try_Catch_Finally {
    public static void main(String[] args) {
        try{
            int b = 100/0;
            //int b = 100/10;
            System.out.println(b);
        }catch ( ArithmeticException e){
            System.out.println("Pls don't enter o in divisible");
            //e.printStackTrace();
        }finally {
            System.out.println("I will be always executed");
        }
    }
}
