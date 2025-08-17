package ex_30_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        String s = null;
        int a = 0;
        int[] arr = {1,11};
        int[] arr1 = new int[4];

        try{
            System.out.println(arr[1]);
            //System.out.println(arr1[8]); if the 1st exception got triggered, the below codes will not execute
            System.out.println("Before string trim");
            String new_s = s.trim();
            System.out.println("After string trims");
            int b = 33/a;
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("Error becoz of divide by zero or null value excpetion");
        }catch (Exception e){
            System.out.println("Unknown Error !!");
        }
    }
}
