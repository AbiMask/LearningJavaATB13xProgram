package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multil_LEVLE {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        g.gf();
        g.home();
        System.out.println(g.gold_gf);

        System.out.println("-------");

        Father f = new Father();
        f.f();
        f.home();
        f.gf();
        System.out.println(f.gold_gf);

        System.out.println("-------");
        Son s = new Son();
        s.s();
        s.f();
        s.gf();
        s.home();
        System.out.println(s.gold_gf);
    }
}
