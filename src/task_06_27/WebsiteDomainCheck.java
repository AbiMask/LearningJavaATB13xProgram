package task_06_27;

import java.util.Scanner;

public class WebsiteDomainCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url: ");
        String url = sc.nextLine();

        String[] string_url = url.split("\\.");
        String domain = string_url[string_url.length-1];

        if(domain.equals("com"))
            System.out.println("The website type is: Commercial website");
        else if(domain.equals("org"))
            System.out.println("The website type is: Non-profit organization");
        else if(domain.equals("edu"))
            System.out.println("The website type is: Educational institution");
        else if(domain.equals("gov"))
            System.out.println("The website type is: Government website");
        else if(domain.equals("net"))
            System.out.println("The website type is: Network-related website");
        else if(domain.equals("info"))
            System.out.println("The website type is: Informational website");
        else if(domain.equals("xyz"))
            System.out.println("The website type is: Unknown or other types of websites");

    }
}
