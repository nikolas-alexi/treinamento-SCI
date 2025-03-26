import java.util.Scanner;

public class carteiraMotorista {  
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Digite a sua idade: ");
        idade = check.nextInt();

        System.out.println("Digite seu nome: ");
        nome = check.next();

        if(idade >= 18){
            System.out.println(nome + ", você está apto para tirar a carteira de motorista.");
        } else {
            System.out.println(nome + ", você não pode tirar a carteira de motorista.");
        }
        check.close();
    }
}
