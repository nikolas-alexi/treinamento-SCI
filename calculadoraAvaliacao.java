import java.util.Scanner;

public class calculadoraAvaliacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
        int escolha = scanner.nextInt();

        String continuar;

        do {
            switch (escolha) {
                case 1:
                    
                System.out.print("Digite o primeiro número: ");
                int somanum1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int somanum2 = scanner.nextInt();

                int soma = somanum1 + somanum2;

                System.out.println("A soma dos dois números é " + soma);
                    break;

                case 2:
                    
                System.out.print("Digite o primeiro número: ");
                int subnum1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int subnum2 = scanner.nextInt();

                int subtracao = subnum1 - subnum2;

                System.out.println("A subtração dos dois números é " + subtracao);

                    break;
                
                case 3:
                    
                System.out.print("Digite o primeiro número: ");
                int multinum1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int multinum2 = scanner.nextInt();

                int multiplicacao = multinum1 * multinum2;

                System.out.println("A multiplicação dos dois números é " + multiplicacao);

                    break;

                case 4:
                    
                System.out.print("Digite o primeiro número: ");
                int divinum1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int divinum2 = scanner.nextInt();

                int divisao = divinum1 % divinum2;

                System.out.println("A divisão dos dois números é " + divisao);

                    break;
            
                default:
                System.out.println("Número inválido! tente novamente entre 1 e 4.");
                    break;
            }
            
            System.out.print("Você quer fazer outra operação? (sim/não): ");
            continuar = scanner.next();

        }  while (continuar.equalsIgnoreCase("sim"));

        System.out.print("Obrigado por usar a calculadora!");
        scanner.close();
    }
}