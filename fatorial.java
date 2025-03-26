public class fatorial {
    public static void main(String[] args) {
        int num = 5;
        int fatorial = 1;
        
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }
        
        System.out.println("Fatorial de " + num + " é " + fatorial);
    }
}