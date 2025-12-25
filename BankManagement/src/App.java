import java.util.Locale;
import java.util.Scanner;
import entities.Holder;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        String name;
        double balance = 0;
        char initial;
        System.out.print("Enter account number: ");
        number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        initial = sc.next().charAt(0);
        if(initial == 'y'){
            System.out.print("Enter a initial deposit value: ");
            balance = sc.nextDouble();
        }

        Holder holder = new Holder(number, balance, name);
        System.out.println("Account data:");
        System.out.println(holder);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        holder.addBalance(deposit);
        System.out.println("Updated account data:");
        System.out.println(holder);

        System.out.printf("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        holder.decreaseBalance(withdraw);
        System.out.println("Updated account data:");
        System.out.println(holder);
        
        sc.close();
    }
}
