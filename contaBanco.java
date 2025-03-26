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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limite;

        if (valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente para saque! (incluindo limite)");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + getSaldo());
        }
    }

    @Override
    void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Limite disponível: R$" + limite);
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuros) {
        super(titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    void aplicarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        setSaldo(getSaldo() + juros);
        System.out.println("Juros de R$" + juros + " aplicados. Novo saldo: R$" + getSaldo());
    }

    @Override
    void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Taxa de juros: " + taxaJuros + "% ao ano");
    }
}

public class contaBanco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Carlos Silva", 1000.0, 500.0);
        contaCorrente.exibirSaldo();
        contaCorrente.depositar(200);
        contaCorrente.sacar(1500);
        contaCorrente.sacar(500);

        ContaPoupanca contaPoupanca = new ContaPoupanca("Ana Costa", 2000.0, 5.0);
        contaPoupanca.exibirSaldo();
        contaPoupanca.depositar(100);
        contaPoupanca.aplicarJuros();
    }
}