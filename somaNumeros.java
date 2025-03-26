import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        int soma = 0;
        int numero;

       System.out.println("Digite 5 números");
       
       for(int i = 0; i < 5; i++){
        System.out.print("Número " + (i + 1) + ": ");
        numero = scanner.nextInt();
        soma += numero;
       }
       System.out.println("A soma dos números é: "+ soma);
       scanner.close();
    }
}