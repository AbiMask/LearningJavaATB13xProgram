package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String s1 = "Abi";
        s1.toLowerCase();
        System.out.println(s1); //this will print only s1 and not s1.tolowercase()

        s1 = s1.toUpperCase();
        System.out.println(s1);
    }
}
