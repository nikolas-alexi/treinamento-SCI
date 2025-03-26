import java.util.Scanner;

public class controleDeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];
        double soma = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            double nota;
            do {
                System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
            soma += nota;
        }

        double media = soma / quantidadeNotas;

        System.out.println("\nMédia das notas é: %.2f\n");
        if(media >= 7) {
            System.out.println("Você está aprovado!");
        }
        else if (media <= 5) {
            System.out.println("Você está em recuperação!");
        } else {
            System.out.println("Você está reprovado!");
        }
        scanner.close();
    }
}