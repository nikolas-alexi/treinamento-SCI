import java.util.Scanner;

public class doWhilePositivo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero;
    
    for (int i = 0; i <= 3; i++) {
        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Digite um outro número este é negativo!");
            }
        } while (numero <= 0);

        System.out.println("Você digitou um número positivo: " + numero);
    }

    scanner.close();

    }
}
