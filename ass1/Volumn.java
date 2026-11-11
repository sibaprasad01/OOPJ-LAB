import java.util.*;
public class Volumn{
    public static void main(String[] args) {
       int x ,y;
       int z,vol,rec,sq;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length : ");
       x = sc.nextInt();
       System.out.println("Enter the breadth : ");
       y = sc.nextInt();
       System.out.println("Enter the height");
       z = sc.nextInt();    
       vol = x*y*z;
       rec = x*y;
       sq  = x*x;
       System.out.println("The vol for cuboid is : "+vol);
  System.out.println("The area for rectangle is : "+rec);
  System.out.println("The area for square is : "+sq);
      


    }
}