import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.print("Wich percentage to inccrease salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Update data: " + employee);
        sc.close();
    }    
}
class Employee {
    String name;
    double grossSalary, tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary *= (percentage/100 + 1);
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", grossSalary-tax);
    }
}