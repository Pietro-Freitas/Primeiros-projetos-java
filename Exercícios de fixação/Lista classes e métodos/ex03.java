import java.util.Scanner;
import java.util.Locale;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();

        double f = student.finalGrade();

        boolean p = student.pass(f);

        System.out.printf("FINAL GRADE = %.2f%n", f);
        if(p == true) System.out.println("PASS");
        else{
            System.out.println("FAILED");
            double missing = (double) 60.00 - f;
            System.out.printf("MISSING %.2f POINTS%n", missing);
        }

        sc.close();
    }
}

class Student {
    String name;
    double note1, note2, note3, Final = 0;

    public double finalGrade(){
        Final = note1 + note2 + note3;
        return Final;
    }

    public boolean pass(double Final){
        return (Final >= 60.00 ? true : false);
    }

}