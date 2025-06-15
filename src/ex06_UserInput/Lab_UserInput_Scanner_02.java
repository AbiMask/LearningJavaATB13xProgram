package ex06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Requesting User to Enter all inputs");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Byte Value: ");
        byte b = scanner.nextByte();

        System.out.print("Enter Short Value: ");
        short s = scanner.nextShort();

        System.out.print("Enter Int Value: ");
        int i = scanner.nextInt();

        System.out.print("Enter Long Value: ");
        long l = scanner.nextLong();

//        System.out.print("Enter Char Value: ");
//

        System.out.print("Enter Float Value: ");
        float f = scanner.nextFloat();

        System.out.print("Enter Double Value: ");
        double d  = scanner.nextDouble();

        System.out.print("Enter Boolean Value: ");
        boolean b1 = scanner.nextBoolean();

        System.out.print("Enter String Value: ");
        String s1 = scanner.next();

        System.out.println(b+" "+s+" "+i+" "+l+" "+d+" "+f+" "+b1+" "+s1);

    }
}
