import java.util.Scanner;

public class numeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        int soma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        if (soma == numero) {
            System.out.println("O número " + numero + " é perfeito!");
        } else {
            System.out.println("O número " + numero + " não é perfeito.");
        }

        scanner.close();
    }
}