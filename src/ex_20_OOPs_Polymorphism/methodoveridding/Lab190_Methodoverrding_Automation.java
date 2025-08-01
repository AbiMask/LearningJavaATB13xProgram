package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {
        ChromeTC chrome = new ChromeTC();
        chrome.openBrowser();

        Firefox ff = new Firefox();
        ff.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();

        // Firefox ff = new ChromeTC(); Not relation

    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class ChromeTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }

}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}
