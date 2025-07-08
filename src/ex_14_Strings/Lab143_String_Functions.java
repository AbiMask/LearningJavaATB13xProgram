package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Subi";// 0,1,2,3
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Mask"));

        // 3. contains()
        System.out.println(name.contains("Su"));

        // 4. equals()
        System.out.println(name.equals("subi"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("subi"));


        // 6. indexOf() //  Subi -> ? b
        System.out.println(name.indexOf('b'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        System.out.println(s1.lastIndexOf("m"));


        // 7. length()
        System.out.println(name.length());

        // 8. replace( , ) // sonal
        System.out.println(name.replace('S', 's'));

        // 9. split()

        String name4 = "abi@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);



        // 10. substring( , )  , Subi
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SUBI".toLowerCase());

        // 12. toUpperCase()
        System.out.println("subi".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("i"));


        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

        //        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "Abimasks";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("a"));
        System.out.println(n.lastIndexOf("s"));


    }
}