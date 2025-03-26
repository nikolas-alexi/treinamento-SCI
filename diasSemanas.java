import java.util.Scanner;

public class diasSemanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para escolher o dia da semana: ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
            System.out.println("Segunda-feira");
                break;

            case 2:
            System.out.println("terça-feira");
                break;

            case 3:
            System.out.println("Quarta-feira");
                break;
            
            case 4:
            System.out.println("Quinta-feira");
                break;

            case 5:
            System.out.println("Sexta-feira");
                break;
            
            case 6:
            System.out.println("Sábado");
                break;
            
            case 7:
            System.out.println("Domingo");
                break;

            default:
            System.out.println("Dia inválido escolha de 1 a 7");
                break;
        }
        scanner.close();
    }
}
