import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("digite um outro número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.print("A soma dos dois números é: " + soma);

        scanner.close();
    }
}