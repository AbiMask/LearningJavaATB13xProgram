package exam_06_21;

public class Challenge_15_Prime_Number {
    public static void main(String[] args) {
        boolean isPrime;
        System.out.print("Prime numbers between 1 to 100:\t");
        for (int i=2; i<=100; i++){
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(i+"\t");
        }
    }
}
