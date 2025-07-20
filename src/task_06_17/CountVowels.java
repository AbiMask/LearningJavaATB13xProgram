package task_06_17;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.next().toLowerCase();

        int a=0, e=0, i=0, o=0, u=0, consoant=0;
        
        for(int j=0; j<str.length(); j++){
            if(str.charAt(j) == 'a')
                a=1;
            else if (str.charAt(j) == 'e')
                e=1;
            else if (str.charAt(j) == 'i')
                i=1;
            else if (str.charAt(j) == 'o')
                o=1;
            else if (str.charAt(j) == 'u')
                u=1;
            else
                consoant++;
        }

        System.out.println("Vowels: "+ (a+e+i+o+u));
        System.out.println("Consonants: "+consoant);
    }
}
