
import java.util.*;

public class Quadratic {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
      double d;
   System.out.println("Enter cofficent of x^2 : ");
     a = sc.nextInt();
    System.out.println("Enter cofficent of x : ");
     b = sc.nextInt();
     System.out.println("Enter constant   : ");
     c = sc.nextInt();
     d = b*b-4*a*c;
     System.out.printf("descriminant : %.2f\n",d);
     if(d>0){
    double r1 = (-b+(Math.sqrt(d)))/(2*a);
    double r2 = (-b-(Math.sqrt(d)))/(2*a);
     System.out.printf("Root 1 : %.2f\n",r1);
     System.out.printf("Root 2 : %.2f",r2);
}
else if(d==0){
double r1 = -b/(2*a);
System.out.printf("Both root are : %.2f\n",r1);
}
else{
     System.out.println("Imaginary roots");
}
      
        sc.close();

    }
}
