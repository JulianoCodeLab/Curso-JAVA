package entities;

public class Account {

    //metodos privados
    private int number;
    private String holder;
    private double balance;





    //construtor de 1 argumento
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //contrtor de 3 argumentos
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }


    //encapsulamento dos metodos.
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    //criando a regra de deposito
    public void deposit(double amount){
        balance += amount;
    }

    //metodo para sacar + taxa de saque
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    //exibindo mensagem na tela
    public String toString(){
        return "Account "
                + number
                + ", Holder"
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
