class contaBancaria {

    String titular;
    double saldo;

    void depositar (double valor) {
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " Adicionado com sucesso! saldo da conta atual é de R$ " + saldo);
    }

    void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " Realizado com sucesso! Saldo atual de R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }

}

public class testeConta {
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria();

        minhaConta.titular = "Níkolas Alexi";
        minhaConta.saldo = 500.00;

        minhaConta.depositar(300.00);

        minhaConta.exibirSaldo();
    }
}
























/*public class contaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        System.out.println("Deposito de valor " + valor + "realizado. Novo saldo de: R$ " + saldo);
    }

    void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        } 
    }

    void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria();

        minhaConta.titular = "Nikolas";
        minhaConta.saldo = 1000.00;

        
        minhaConta.sacar(2000.00);

        minhaConta.exibirSaldo();
    }
}*/
