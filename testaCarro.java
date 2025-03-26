class carro {
    String modelo;
    int ano;
    String marca;

    void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("marca: " + marca);
        System.out.println("ano: " + ano);
    }
}

public class testaCarro {
    public static void main(String[] args) {
       carro meuCarro = new carro();
       
       meuCarro.ano = 2023;
       meuCarro.marca = "fiat";
       meuCarro.modelo = "Chevrolet";

       meuCarro.exibirInfo();
    }
}



























/*class carro {
    String marca;
    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class testaCarro {
    public static void main(String[] args) {
        carro carro = new carro();

        carro.ano = 2014;
        carro.marca = "fiat";
        carro.modelo = "chevrolet";

        carro.exibirInfo();
    }
    
}*/

