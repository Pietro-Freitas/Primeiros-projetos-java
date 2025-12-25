import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        
        System.out.println(areaX);
        System.out.println(areaY);

        sc.close();
    }
}
class Triangle {
    public double a;
    public double b;
    public double c;
    
    public double area(){
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }
}