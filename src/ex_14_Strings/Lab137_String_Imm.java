package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "Abi";
        s1 = s1.concat("Mask"); //two objects are created in SCP. 1->Abi 2->AbiMask
        System.out.println(s1);
    }
}
