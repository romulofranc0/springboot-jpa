package program;

import java.util.Scanner;

import utilities.CurrencyConverter;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("cotação do dólar hoje:");
        double cotacao=sc.nextDouble();
        System.out.println("Quantidade de dólar que deseja comprar: ");
        double qtd=sc.nextDouble();
        
        double valor=CurrencyConverter.conversor(cotacao,qtd);
        System.out.println("Valor final com impostos: "+ valor);
        
        sc.close();
    }
}
