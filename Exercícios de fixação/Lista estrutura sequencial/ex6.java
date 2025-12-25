import java.util.Scanner;
import java.util.Locale;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double t, cii, tr, q, r;
        t =  a * c / 2;
        r = c*c * 3.14159;
        tr = (a+b) * c / 2;
        q = b*b;
        cii = a * b;
        System.out.printf("TRIANGULO = %.3f%n",t);
        System.out.printf("CIRCULO = %.3f%n", r);
        System.out.printf("TRAPEZIO = %.3f%n", tr);
        System.out.printf("QUADRADO = %.3f%n", q);
        System.out.printf("RETANGULO = %.3f%n", cii);
        sc.close();
    }
}
