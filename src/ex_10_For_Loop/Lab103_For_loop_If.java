package ex_10_For_Loop;

public class Lab103_For_loop_If {
    public static void main(String[] args) {
        for(int i=1; i<20; i++){
            if(i%2 == 0){
                System.out.println(i + " is a even number");
            }
            else System.out.println(i+ " is a odd number");
        }
    }
}
