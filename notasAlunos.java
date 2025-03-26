import java.util.Scanner;

public class notasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1, nota2, nota3, nota4, nota5, mediaNotas;

        System.out.println("Digite sua primeira nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite sua segunda nota: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite sua terceira nota: ");
        nota3 = scanner.nextInt();

        System.out.println("Digite sua quarta nota: ");
        nota4 = scanner.nextInt();

        System.out.println("Digite sua quinta nota: ");
        nota5 = scanner.nextInt();

        mediaNotas = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        if (mediaNotas >= 7) {
            System.out.println("Aprovado");
        }
        else if (mediaNotas >= 4 && mediaNotas < 7) {
            System.out.println("Recuperação");
        }
        else if (mediaNotas < 4) {
            System.out.println("Reprovado");
        }
        System.out.println("Sua média final é de " + mediaNotas);
        scanner.close();
    }
}
