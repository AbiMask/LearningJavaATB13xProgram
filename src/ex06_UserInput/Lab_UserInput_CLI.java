package ex06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        //args input from configuration
        String age_string = args[0];
        System.out.println(age_string);

        int age = Integer.parseInt(age_string);
        String res = (age >= 18) ? "vote" : "no vote";
        System.out.println(res);

    }
}
