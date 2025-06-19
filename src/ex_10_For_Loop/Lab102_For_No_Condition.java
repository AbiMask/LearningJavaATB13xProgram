package ex_10_For_Loop;

public class Lab102_For_No_Condition {
    public static void main(String[] args) {
        for (int i=0; ;i++){
            System.out.println(i);
        }
        // for loop without condition will execute infinite times
        // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
    }
}
