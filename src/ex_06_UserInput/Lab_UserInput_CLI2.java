package ex_06_UserInput;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        //args multiple input from configuration
        String input1 = args [0];
        String input2 = args [1];
        String input3 = args [2];
        System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException - if no input is provided
        System.out.println(args[0] + " "+args[1] + " "+ args[2]);

        for (String inputs : args ){
            System.out.println(inputs);
            System.out.println(Integer.parseInt(inputs)+0.11);
        }
    }
}
