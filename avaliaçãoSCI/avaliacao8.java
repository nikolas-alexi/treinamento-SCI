import java.util.Scanner;

public class avaliacao8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você quer adicionar? ");
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

        System.out.println("\nMédia da turma é: %.2f\n" + media);

        if (quantidadeNotas < 7) {
            //int alunosAcimaMedia;
           // System.out.println("Alunos acima da média: " + alunosAcimaMedia);
        }
        
        scanner.close();
    }
}