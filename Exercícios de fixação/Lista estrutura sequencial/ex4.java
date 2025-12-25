import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, h; double s;
        n = sc.nextInt();
        h = sc.nextInt();
        s = sc.nextDouble();
        
        double st = (double) s * h;
        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f", st);

        sc.close();
    }
}
