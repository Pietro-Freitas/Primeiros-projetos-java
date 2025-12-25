import  java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        r.w = sc.nextDouble();
        r.h = sc.nextDouble();
        System.out.printf("AREA: %.2f%n", r.area());
        System.out.printf("PERIMETER: %.2f%n", r.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", r.diagonal());
        sc.close();
    }

}

class Rectangle {
    double w, h;
    public double area(){
        return w * h;
    }
    public double perimeter(){
        return 2*w + 2*h;
    }
    public double diagonal(){
        return Math.sqrt(h*h + w*w);
    }
}