// Classe principal da conta bancária
public class testeContaMediaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public testeContaMediaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor adicionado de R$ " + valor + " com sucesso! Saldo atual de R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Valor sacado de R$ " + valor + " com sucesso! Saldo atual de R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual de R$ " + saldo);
    }
}