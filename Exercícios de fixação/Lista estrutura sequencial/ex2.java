import java.util.Locale;
import java.lang.Math;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double r, a; Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        a = Math.pow(r,2) * 3.14159;
        sc.close();
        System.out.printf("a=%.4f", a);
    }
}
