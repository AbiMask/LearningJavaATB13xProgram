package ex_29_Wrapper_Class;

public class Lab212_Primitive_Wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive

        // This is not Object
        // It will not have attribute or Behaviour

        // Character, Boolean, Short, Long, Double, Float
        Integer b = 20;
        Integer c = a;

        System.out.println(b);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(c.intValue());

    }
}
