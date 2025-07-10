package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abishek");
        sb.append(" Mask");
        System.out.println("Append: "+sb);

        sb.delete(3,7);
        System.out.println("Delete: "+sb);

        sb.replace(0,3,"Subi");
        System.out.println("Replace: "+sb);
    }
}
