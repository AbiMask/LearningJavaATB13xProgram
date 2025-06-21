package Re_exam_21_06;

public class Challenge_13_Multiplication {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("Table of "+i+":");
            for (int j=1; j<=10; j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
}
