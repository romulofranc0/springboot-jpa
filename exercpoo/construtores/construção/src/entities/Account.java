package entities;

public class Account {
    private int conta;
    private String name;
    private double saldo;


    
    public int getConta() {
        return conta;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name, int conta) {
        this.name = name;
        this.conta = conta;
    }

    public Account(int conta, String name, double depositoInicial) {
        this.conta = conta;
        this.name = name;
        deposito(depositoInicial);
    }

    public void deposito(double valor){
        saldo+=valor;
    }
    public void saque(double valor){
        saldo-=valor + 5;
    }

    public String toString(){
        return "Account "
        + conta
        +", holder:"
        +name
        +", balance: $ "
        +String.format("%.2f", saldo);
    }

}
