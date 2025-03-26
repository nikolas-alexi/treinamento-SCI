public class testeBanco {
    public static void main(String[] args) {
        testeContaMediaBancaria contaUsuario1 = new testeContaMediaBancaria("Nikolas", 600.00);

        contaUsuario1.exibirInfo();
        contaUsuario1.depositar(300.00);
        contaUsuario1.sacar(200.00);

        // Modificando o titular
        contaUsuario1.setTitular("Joãozinho");
        System.out.println("Novo nome titular: " + contaUsuario1.getTitular());
    }
}