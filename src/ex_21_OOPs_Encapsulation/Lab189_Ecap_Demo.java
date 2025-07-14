package ex_21_OOPs_Encapsulation;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        VMOLogin login1 = new VMOLogin("Abi", "Pass123");
        System.out.println(login1.name);
        login1.password = "newpass123";
        System.out.println(login1.password);
        //From the above code, user is able to access the attributes from the main the funciton
        //As part of encapsulation, user shouldn't be able to access


        NewVMOLogin login2 = new NewVMOLogin("Subi", "subismask");
//        System.out.println(login2.password);
//        System.out.println(login2.name);
//        login2.password = "NewSubi";
//        System.out.println(login2.password);
        System.out.println(login2.getName());
        System.out.println(login2.getPassword());
        login2.setPassword("New Password",false);
        System.out.println(login2.getPassword());

        login2.setPassword("New Password",true);
        System.out.println(login2.getPassword());

    }

}



class VMOLogin{
    String name;
    String password;

    VMOLogin(String name, String password){
        this.name = name;
        this.password = password;
    }
}

class NewVMOLogin{
    private String name;
    private String password;

    public NewVMOLogin(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {      //If this function is not used, user cannot set the password
       if(isAdmin)                                                    //We are making the user to access attributes via methods/behaviour
            this.password = password;
       else
           System.out.println("Can't change the password");
    }
}