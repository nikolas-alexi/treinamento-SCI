import java.util.Scanner;

public class avaliacao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diasAno = 365;
        int diasMes = 30;

        System.out.print("Me diga quantos anos você tem: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite agora seu mês de nascimento: ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite por fim seu dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        int diasdoNascimento = anoNascimento * diasAno;

        int diasdoMes = mesNascimento * diasMes;

        int SomatotalDiasVividos = diasdoMes + diasdoNascimento + diaNascimento;

        System.out.println("Sua idade em dias é: " + SomatotalDiasVividos);

        scanner.close();
    }
}
