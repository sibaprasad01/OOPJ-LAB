
import java.lang.*;

public class swwwap {

    public static void main(String[] args) {
        int x = 3;
        int y = 2;

        System.out.println("first number is : " + x);
        System.out.println("sencond  number is : " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("after swap first number : " + x);
        System.out.println("after swap first seconnd number  :  " + x);

    }
}
