package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

//        String browser = args[0];
//        System.out.println(browser);
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        browser = browser.toUpperCase();

        switch (browser){
            case "CHROME": {
                System.out.println("Execute in chrome browser");
                System.out.println("............");
                break;
            }
            case "EDGE": {
                System.out.println("Execute in Edge browser");
                break;
            }
            case "FIREFOX": {
                System.out.println("Execute in Fire fox browser");
                break;
            }
            default: {
                System.out.println("Not enetered a valid browser name");
                break;
            }
        }
    }
}
