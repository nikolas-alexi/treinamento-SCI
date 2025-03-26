import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int primeiroNumero;

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = scanner.nextInt();

        int maior = primeiroNumero;
        int menor = primeiroNumero;

        for(int i = 1; i < 10; i++){
            System.out.println("Digite o próximo número: ");
            int numero = scanner.nextInt();
            
            if (numero > maior){
                maior = numero;
            }
            else if(numero < menor){
                menor = numero;
            }
            
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}