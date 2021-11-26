package com.grit;



public class Account {

    //State
    private int AccNum;
    private int Balance;
    private String AccType;

    //Constructor
    public Account(int accNum){
        AccNum = accNum;
        Balance = 0;
        AccType = "Debit";
    }

    //Behaviour
    public boolean Deposit(int amount)
    {
        if(amount > 10000){
            return false;
        }
        else{
            Balance = Balance + amount;
            return true;
        }
    }
    public boolean Withdraw(int amount)
    {
        if(amount > Balance){
            return false;
        }else{
            Balance = Balance - amount;
            return true;
        }
    }
    public String AccountInfo(){
        String accInfo = "Account Type: " + AccType + "\n" +
                "Account Number " + AccNum + "\n" +
                "Current Balance " + Balance;
        return accInfo;
    }

}
