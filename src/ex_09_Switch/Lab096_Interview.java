package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {
        // default can be given in any place along with break
        char code = 'C';

        switch (code){
            default:
                System.out.println("Hellooooooo");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}