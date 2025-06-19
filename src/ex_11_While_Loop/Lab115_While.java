package ex_11_While_Loop;

public class Lab115_While {
    public static void main(String[] args) {
        int i=0;

        while (i<10){
            System.out.println(i);
            i++;
        }

        // while loop is similar to for loop which initialize the var outside
        int j=0;
        for( ;j<10;j++){
            System.out.println(j);
        }
    }
}
