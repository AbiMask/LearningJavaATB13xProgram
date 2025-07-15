package ex_22_OOPs_accessModifer.police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    protected void isShootable(){
        System.out.println("Yes, you can shoot " + gun);
    }

    void thisDefault(){
        System.out.println("Hi, Cop");
    }
}

