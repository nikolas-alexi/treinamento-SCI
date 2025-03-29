import java.util.Scanner;

public class avaliacao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pacoteBiscoito = 40;
        int porcoes = 10;
        int calorias = 300;

        System.out.print("Quantos biscoitos você comeu? ");
        int unidadeBiscoito = scanner.nextInt();

        int caloriasPorcoes = porcoes * calorias;

        int caloriasBiscoito = caloriasPorcoes / pacoteBiscoito;
          
        System.out.println("Você consumiu " + unidadeBiscoito + " biscoitos o que equivale a " + caloriasBiscoito);
        
        /*int divisaobiscoito = pacoteBiscoito / unidadeBiscoito;

        int caloriasConsumidas = unidadeBiscoito * calorias;*/

        scanner.close();
    }
}
