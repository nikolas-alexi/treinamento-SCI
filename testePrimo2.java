public class testePrimo2 {
    public static void main(String[] args) {
        int num = 9;
        boolean primo = true;

        for (int i = 2; i < num; i++) {
         if (num % i == 0) {
         primo = false;
         break;
        }
    }

     System.out.println(num + " é primo? " + primo);

    }
}
