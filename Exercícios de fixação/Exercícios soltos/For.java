import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = x-1; i > 0; i--){
            x *= i;
        }
        System.out.println(x);
        sc.close();
    }
}
