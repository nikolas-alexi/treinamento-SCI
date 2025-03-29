import java.util.Scanner;

public class avaliacao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeTerreno, trapezoidal, retangular;

        int calculoRetangulo, calculoTrapezoidal;

        int areaTerreno , baseTerreno, alturaTerreno;

        int baseMaior, baseMenor;
        
        System.out.print("O terreno é retangular ou trapezoidal? ");
        nomeTerreno = scanner.nextLine();

        System.out.print("Digite a área do terreno: ");
        areaTerreno = scanner.nextInt();

        System.out.print("Digite a base do terreno: ");
        baseTerreno = scanner.nextInt();

        System.out.print("Digite a altura do terreno: ");
        alturaTerreno = scanner.nextInt();

        for (int i = 0; i < baseTerreno; i ++) {
            int numero = scanner.nextInt();
            
            if (numero > baseMaior){
                baseMaior = numero;
            }
            else if(numero < baseMenor){
                baseMenor = numero;
            }
        }
        if (nomeTerreno.equals(retangular)) {

            calculoRetangulo = areaTerreno * alturaTerreno;

        }

        //não sei como resolver esse erro acho que cheguei o mais perto possivel
        if else (areaTerreno.equals(trapezoidal)) {

            areaTerreno = (baseMaior + baseMenor) *alturaTerreno / 2;

        }

        System.out.print("Tipo: " + nomeTerreno);
        System.out.print("Base: " + baseTerreno);
        System.out.println("Altura " + alturaTerreno);
        System.out.println("Área do terreno: " + areaTerreno);

        scanner.close();
    }
}
