import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        float peso, altura, imc;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu peso atual: ");
        peso = scanner.nextFloat();

        System.out.println("Digite sua altura atual: ");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("você está abaixo do peso " + nome);
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está com peso ideal " + nome);
        }
        else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Você está com sobrepeso " + nome);
        }
        else if (imc >= 30.0 && imc <= 39.9){
            System.out.println("Você está obeso " + nome);
        }
        else {
            System.out.println("Você está com besidade morbida " + nome);
        }
        scanner.close();
    }
}