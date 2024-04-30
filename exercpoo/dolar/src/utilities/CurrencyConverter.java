package utilities;


public class CurrencyConverter {

    public static final double IOF=1.06;
    public static double valor;

    public static double conversor(double cotacao,double qtd){
    
        valor=cotacao*qtd;
        valor=valor*IOF;
        return valor;
    }
}
