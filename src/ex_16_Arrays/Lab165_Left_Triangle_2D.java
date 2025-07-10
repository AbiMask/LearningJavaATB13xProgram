package ex_16_Arrays;

public class Lab165_Left_Triangle_2D {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
