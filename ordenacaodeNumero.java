import java.util.Scanner;

public class ordenacaodeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números");

        for(int i = 0; i < 10; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nNúmeros em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        scanner.close();

    }
}