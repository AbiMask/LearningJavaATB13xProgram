package task_07_03.MethodOverriding;

public class LoginFunctionality {
    public static void main(String[] args) {
        User adminuser = new AdminUser();
        adminuser.login();

        new RegularUser().login();
    }
}

class User {
    void login(){
        System.out.println("User Login");
    }
}

class AdminUser extends User{
    void login(){
        System.out.println("Admin User");
    }

}

class RegularUser extends User{
    void login(){
        System.out.println("Regular User");
    }
}
