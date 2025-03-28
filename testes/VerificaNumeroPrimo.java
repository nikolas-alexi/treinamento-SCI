import java.util.Scanner;

public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("Número inválido! O número deve ser maior que 1.");
        } else {
            boolean isPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println("O número " + num + " é primo.");
            } else {
                System.out.println("O número " + num + " não é primo.");
            }
        }
        
        scanner.close();
    }
}