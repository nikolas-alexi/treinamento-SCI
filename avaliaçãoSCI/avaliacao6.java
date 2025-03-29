import java.util.Scanner;

public class avaliacao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Preço do produto: ");
        int precoProduto = scanner.nextInt();

        if (precoProduto < 50) {
          int precoProdutoMaior = precoProduto % 45;
          System.out.println("Preço de venda: R$ " + precoProdutoMaior);
        } else {
            int precoProdutoMenor = precoProduto % 30;
            System.out.println("Preço de venda: " + precoProdutoMenor);
        }
        scanner.close();
    }
}
