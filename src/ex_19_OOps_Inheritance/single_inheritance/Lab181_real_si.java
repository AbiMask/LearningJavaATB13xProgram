package ex_19_OOps_Inheritance.single_inheritance;

public class Lab181_real_si {
    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1();
        tc1.runningTC1();

        TestCase2 tc2 = new TestCase2();
        tc2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        c1.startBrowser();
        c1.readExcelFile();
        c1.closeBrowser();

        TestCase1 tc3 = new TestCase1();

        //Dynamic Dispatch - Parent Class = Child Object
        CommonToAll c2 = new TestCase1();
        //c2.runningTC2();

        //TestCase1 tc4 = new CommonToAll();

    }
}
