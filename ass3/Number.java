
import java.util.*;

public class Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter an number : ");
        x = sc.nextInt();
        if (x > 0) {
            System.out.println("ENTERD NUMBER IS POSITIVE");
        } else if (x < 0) {
            System.out.println("ENTERED NUMBER IS NEGATIVE");
        } else {
            System.out.println("ENTERED NUMBER IS 0");
        }
        sc.close();

    }
}
