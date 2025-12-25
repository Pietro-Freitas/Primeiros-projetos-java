import java.util.Scanner;

public class MAin {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int c = max(a, b);
        System.out.println(c);
        sc.close();
    }

    public static int max(int a, int b){
        int c = 0;
        if(a > b) c = a;
        else if(a < b) c = b;
        else c = a;
        return c;
    }
}   
