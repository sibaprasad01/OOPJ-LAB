
import java.util.*;

public class Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        double salary = sc.nextDouble();
        double hra = (salary * 10) / 100;
        double da = (salary * 60) / 100;
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        sc.close();

    }
}
