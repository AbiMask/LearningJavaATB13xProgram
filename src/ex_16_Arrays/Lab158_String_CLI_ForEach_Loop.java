package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] args) {
        //10 abi true

        for(int i=0; i< args.length; i++){
            System.out.println(args[i]);
        }

        System.out.println("_______________");

        for(String str:args){
            System.out.println(str);
        }
    }
}
