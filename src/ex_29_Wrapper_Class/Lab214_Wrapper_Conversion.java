package ex_29_Wrapper_Class;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {
        //Boxing - Conversion of primitive to wrapper class
        int a = 10;
        Integer b = Integer.valueOf(a); //Can be manually converted
        System.out.println("Primitive:" + a);
        System.out.println("Wrapper: " +b);

        //Auto Boxing - Conversion of primitive to wrapper class
        int c = 50;
        Integer d = c; //JVM automatically converts this
        System.out.println("Primitive:" + c);
        System.out.println("Wrapper: " +d);

        //Unboxing - Conversion of wrapper to primitive
        Integer e = 100;
        int f = e;
        int g = e.intValue();
        System.out.println("Primitive:" + f);
        System.out.println("Wrapper: " +e);
        System.out.println("Primitive:" + g);

    }
}
