package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Locale;

public class Interview_Vowels {
    public static void main(String[] args) {
        // Java Program to Count Vowels and Consonants
        // abimask -> a,i,e,o,u -> V- 3, C- 4

        String str = "abimask";
        str = str.toLowerCase();
        int countVow = 0;
        int countCons = 0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                countVow++;
            }
            else
                countCons++;
        }

        System.out.println("Vowels: "+countVow+" Cosonants: "+countCons);
    }
}
