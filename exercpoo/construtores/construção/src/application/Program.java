package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number:");
        int conta=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter holder name:");
        String name=sc.nextLine();
        System.out.println("Will make a deposit?(Y/N):");
        char resposta= sc.next().charAt(0);
        if(resposta=='y'){
            System.out.println("Enter ammount:");
            double saldo=sc.nextDouble();
            account=new Account(conta, name, saldo);
        }
        else {
            account=new Account(name, conta);
        }

       System.out.println();
        System.out.println("Account data:");
       System.out.println();
       System.out.println(account);

       System.out.println();
       System.out.println("Enter value for deposit:");
       double depositValue=sc.nextDouble();
       account.deposito(depositValue);;
       
       System.out.println();
       System.out.println("Enter value for withdraw:");
       double withdrawValue=sc.nextDouble();
       account.saque(withdrawValue);;

       System.out.println(account);

        sc.close();
    }
}