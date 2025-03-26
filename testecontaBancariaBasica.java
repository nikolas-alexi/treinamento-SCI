class contaBancariaBasica {
    //atributos
    String titular;
    double saldo;

    //método para depositar dinheiro
    void depositar(double valor) {
        saldo += valor;
    System.out.println("Deposito de R$ " + valor + "Efetuado com sucesso! Saldo atual de R$ " + saldo);
    }

    //mais um método criado de saque da conta
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + "Efetuado com sucesso! Saldo atual de R$ " + saldo);
        }
    }

    // método para exibir temos 3 metodos no total!
    void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }
}

public class testecontaBancariaBasica {
    public static void main(String[] args) {
        contaBancariaBasica conta1 = new contaBancariaBasica();

        conta1.saldo = 1000.00;
        conta1.titular = "Níkolas Alexi";

        conta1.sacar(300.00);

        conta1.exibirSaldo();
    }

}
