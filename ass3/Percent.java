
import java.util.*;

public class Percent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS OF SUB-01 : ");
        int m1 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUB-02 : ");
        int m2 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUB-03 : ");
        int m3 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUB-04: ");
        int m4 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUB-05 : ");
        int m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double per = (total * 100) / 500;
        System.out.println("Total marks scored : " + total);
        System.out.println("Total percentage scored : " + per + " %");

        sc.close();

    }
}
