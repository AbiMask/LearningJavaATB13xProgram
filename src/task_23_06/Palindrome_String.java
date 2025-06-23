package task_23_06;

public class Palindrome_String {

    public static void main(String[] args) {

        String name = "Madam";
        if(check_Palindrome_Rev(name))
            System.out.println(name + " is a Palindrome");
        else
            System.out.println(name + " is not a Palindrome");

    }

    public static boolean check_Palindrome_Two_Pointers(String name){
        name = name.toLowerCase();
        boolean isPalindrome = true;
        int j = name.length()-1;
        for (int i=0; i<name.length()/2; i++) {

            if (name.charAt(i) != name.charAt(j)) {
                return false;
            }
            j--;
        }

        return true;
    }

    public static boolean check_Palindrome_Rev(String name){
        System.out.println("Entered into loop");
        String rev = new String();
        for(int i=name.length()-1; i>=0; i--){
            rev = rev +name.charAt(i);
            System.out.println(rev);
        }
        if(name.equalsIgnoreCase(rev))
            return true;
        else
            return  false;
    }

}