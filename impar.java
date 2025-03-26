import java.util.Scanner;

public class impar {

    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = check.nextInt();

        if(num % 2 == 0){
            System.out.println(num + "é par");
        } else {
            System.out.println(num + "é impar");
        }
        check.close();
    }
}