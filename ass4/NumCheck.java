
import java.util.*;

public class NumCheck {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a  float number A : ");
    float a  = sc.nextFloat();
     System.out.println("Enter a float number B : ");
    float b  = sc.nextFloat();
   int c = (int)(a*1000);
   int d = (int)(b*1000);
    if(c==d){
  System.out.println("Numer A is equal to number B upto THREE DECIMAL POINT");

    }
else{
System.out.println("Numer A is not equal to number B upto THREE DECIMAL POINT");

  
}
     sc.close();
}
}
