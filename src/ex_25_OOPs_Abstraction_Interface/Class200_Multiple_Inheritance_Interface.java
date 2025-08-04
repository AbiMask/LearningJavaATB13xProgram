package ex_25_OOPs_Abstraction_Interface;

public class Class200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Son abi = new Son();
        abi.loan();
    }
}


interface Father1{
    void loan10k();
    void money();
}

interface Father2{
    void loan50k();
    void money();
}

class Son implements Father1,Father2{

    @Override
    public void loan10k() {
        System.out.println("Son to pay 10k loan");
    }

    @Override
    public void loan50k() {
        System.out.println("Son to pay 50k loan");
    }

    @Override
    public void money() {
        System.out.println("Son to save amount to pay back the loan");
    }

    void loan(){
        money();
        loan10k();
        loan50k();

    }
}