import java.util.Scanner;

public class contagem {

    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        System.out.println("Digite um número acima de 10: ");
        int num = check.nextInt();

        if (num < 10) {
            System.out.println("Numero inválido!");
        } else {
            while(num > 0){
                System.out.println(num);
                num--;
            }
            System.out.println("FIM!");
            check.close();
        }
    }
}