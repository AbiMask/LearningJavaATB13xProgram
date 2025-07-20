package task_07_02;

public class MultilevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin p1 = new SuperAdmin();
       p1.login();
       p1.accessAdminPanel();
       p1.shutdownSystem();
    }
}

class User{
    void login(){
        System.out.println("Use me to login");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("User me to access admin ");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("User me to shutdown system");
    }
}
