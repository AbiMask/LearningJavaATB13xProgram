package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {

        System.out.println("Starting the Program");
        String input = args[0]; //ArrayIndexOutOfBoundsException
        Integer input_int = Integer.parseInt(input); //NumberFormatException
        System.out.println(input_int);
        Integer output = input_int/0; //ArithmeticException
        System.out.println(output);

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "test"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
    }
}

