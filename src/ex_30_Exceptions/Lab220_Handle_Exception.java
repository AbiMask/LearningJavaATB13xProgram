package ex_30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {

        int a = 0;

        try {
            int result = 100/a; // java.lang.ArithmeticException
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Hey, You cannot divide a number zero");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
