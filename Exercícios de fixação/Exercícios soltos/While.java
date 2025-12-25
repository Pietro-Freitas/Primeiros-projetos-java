import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int tipo = 0, t1 = 0, t2 = 0, t3 = 0;
        Scanner sc = new Scanner(System.in);
        while(tipo != 4){
            tipo = sc.nextInt();
            if(tipo < 1 && tipo > 4){
                while(tipo < 1 && tipo > 4) tipo = sc.nextInt();
            }
            if(tipo == 1) t1++;
            if(tipo == 2) t2++;
            if(tipo == 3) t3++;
            if(tipo == 4) break;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + t1);
        System.out.println("Gasolina: " + t2);
        System.out.println("Diesel: " + t3);
        sc.close();
    }
}
