import java.util.Scanner;

public class verificarMaioridade {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Digite sua Idade: ");
        idade = check.nextInt();

        System.out.println("Digite seu nome: ");
        nome = check.next();

        if(idade > 18){
            System.out.println("Você é maior de idade " + nome);
        } else {
            System.out.println("Você é menor de idade " + nome);
        }
        check.close();
    }
}
