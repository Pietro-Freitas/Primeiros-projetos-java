import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        int x, y, s; Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        s = x + y;
        System.out.println("Soma = " + s);
        sc.close();
    }
}
