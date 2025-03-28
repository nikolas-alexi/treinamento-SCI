class animal {
    
    String raca;
    double tamanhoPelo;
    float altura;

    void exibirInfo() {
        System.out.println("Raça: " + raca);
        System.out.println("Tamanho do pelo: " + tamanhoPelo + " cm");
        System.out.println("Altura do cachorro: " + altura + " metros");
    }

}

public class cachorro {
    public static void main(String[] args) {
       animal cachorro  = new animal();
       
       cachorro.tamanhoPelo = 18.5;
       cachorro.raca = "Shih Tzu";
       cachorro.altura = 0.50f;

       cachorro.exibirInfo();
    }
}
