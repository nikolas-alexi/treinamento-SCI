import java.util.Scanner;

public class avaliacao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        int maior = primeiroNumero;
        int menor = primeiroNumero;
        int somaDoisMaiores;

        for(int i = 1; i < 3; i++){
            System.out.println("Digite o próximo número: ");
            int numero = scanner.nextInt();
            
            if (numero > maior){
                maior = numero;
            }
            else if(numero < menor){
                menor = numero;
            }

            System.out.println("os números são: " + numero);

        }
        
        //não sei como fazer o calculo :/
        somaDoisMaiores = maior;
        
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("A soma dos dois maiores números: " + somaDoisMaiores);

        scanner.close();

    }
}






















/*import java.util.Scanner;

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
}*/