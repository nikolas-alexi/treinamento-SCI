import java.util.Scanner;

public class doWhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNegativo = 0;

        do {
            System.out.println("Digite um número negativo: ");
        numNegativo = scanner.nextInt();
        } while (numNegativo < 0);

        if(numNegativo >= 0){
            System.out.println("Erro somente números negativos podem ser aceitos!");
        }
        scanner.close();
    }
}
