package exam_06_25;

public class C2_String_Immutability {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println("Str remains: "+str);

        str = str.concat(" World1230");
        System.out.println("New Str: "+str);
    }
}
