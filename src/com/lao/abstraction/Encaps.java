package com.lao.abstraction;

public class Encaps {
    private int balance;

    public void setBalance(int balance){
        if(balance<0){
            System.out.println("Invalid amount");
            return;
        }
        this.balance = balance;
    }

    public int getbalance(){
        return balance;
    }

}
