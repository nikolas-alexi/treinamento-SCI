import java.util.Scanner;

public class numerosAmigos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        int soma1 = 0;

        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0){
                soma1 += i;
            }
        }

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma2 = 0;

        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0 ) {
                soma2 += i;
            }
        }

        if(soma2 == num1 && soma2 == num1){
            System.out.println("Os números " + num1 + " e " + num2 + " são amigos!");
        } else {
            System.out.println("Os números não são amigos.");
        }
        scanner.close();
    }
}