class ContaBancaria {
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }
    
    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        }
    }
    
    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva", 500.0);
        
        conta1.exibirSaldo();
        conta1.depositar(200.0);
        conta1.sacar(100.0);
        
        conta1.setTitular("Maria Oliveira");
        System.out.println("Novo titular: " + conta1.getTitular());
    }
}