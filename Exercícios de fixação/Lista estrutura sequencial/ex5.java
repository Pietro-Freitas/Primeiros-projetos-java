import java.util.Scanner;
import java.util.Locale;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int np1, np2; double vu1, vu2;
        np1 = sc.nextInt();
        vu1 = sc.nextDouble();
        np2 = sc.nextInt();
        vu2 = sc.nextDouble();

        double vt = (double) np1*vu1 + np2 * vu2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", vt);
        sc.close();
    
    }
}
