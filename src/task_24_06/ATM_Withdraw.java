package task_24_06;

import java.util.Scanner;

public class ATM_Withdraw {
    public static void main(String[] args) {
        //Initial account balance of the user
        int acc_bal = 10000;
        int rem_bal;

        //Enter the amount to withdraw
        System.out.println("Enter the amount to withdraw in multiples of 100: ");
        Scanner sc = new Scanner(System.in);
        int withdraw_amount = sc.nextInt();

        if(withdraw_amount<=0){
            System.out.println("!!Invalid amount");
            return;
        }
        else if(withdraw_amount>acc_bal) {
            System.out.println("!!Insufficient balance");
            return;
        }
        else if(withdraw_amount%100 != 0){
            System.out.println("!!Please enter the amount in multiples of 100");
            return;
        }
        else{
            rem_bal = acc_bal - withdraw_amount;
            System.out.println("!! Withdraw Successful");
            System.out.println("Remaining Balance is: "+rem_bal);

        }
    }
}
