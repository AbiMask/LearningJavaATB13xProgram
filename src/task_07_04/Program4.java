package task_07_04;

public class Program4 {
    public static void main(String[] args) {
        SuperClass sc = new SuperClass();
        sc.setUser_id("test_123");
        sc.setPassword("pass123");

        System.out.println(sc.getUser_id());
        System.out.println(sc.getPassword());
    }
}

class SuperClass{
    private String user_id;
    private String password;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
