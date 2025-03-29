import java.util.Scanner;

public class avaliacao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }
        
        System.out.println("Fatorial de " + num + " é " + fatorial);

        scanner.close();
    }
}