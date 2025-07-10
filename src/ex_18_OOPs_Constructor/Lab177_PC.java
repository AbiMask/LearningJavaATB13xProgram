package ex_18_OOPs_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b1.aadhar_number);
        System.out.println(b1.year);
        System.out.println(b1.month);
        System.out.println(b1.day);


        BabyA b2 = new BabyA("AK","1314123",2024,04,01);
        System.out.println(b2.name);
        System.out.println(b2.aadhar_number);
        System.out.println(b2.year);
        System.out.println(b2.month);
        System.out.println(b2.day);
    }
}

class BabyA{

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    // DC
    BabyA(){
        name = "Gugu";
        aadhar_number = "0000";
        year = 1971;
        month = 01;
        day = 01;
        System.out.println("DC");
    }

    BabyA(String name_user,String aadhar_number_user,int year_user, int month_user,int day_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
        System.out.println("PC");
    }
}