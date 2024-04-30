package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) {
       
        Account acc=new SavingsAccount(1200, "Alex", 2000.0, 0.1);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());
       
        Account acc1=new BusinessAccount(122, "maria", 1000.0, 1200.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

      

    }
    
}
