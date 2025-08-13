package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        String num  = "10";
        // String -> Wrapper
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);
        System.out.println(a +" - "+b);

        // String to Primitive
        int aa = Integer.parseInt(num);

        // Wrapper to String (toString method)
        System.out.println(a.toString());

        // Primitive to String
        System.out.println(Integer.valueOf(aa).toString());
        int age = 30;
        Integer age_integer = age;
        System.out.println(age_integer.toString());
    }
}
