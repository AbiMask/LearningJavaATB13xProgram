package ex_28_ENUM;

public enum Weeks {
    sun("Sunday"),
    mon("Monday");

    private String week;

    Weeks(String week_name){
        this.week = week_name;
    }

    public String getWeek(){
        return this.week;
    }
}

class A{
    public static void main(String[] args) {
        System.out.println(Weeks.mon.getWeek());
    }
}
