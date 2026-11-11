import java.lang.*;
 public class Mins{
public static void main(String[] args){
   int min = 7200;
   int totalDays = min/1440; // right
   int year = totalDays/365;
   int days = totalDays%365;  
   System.out.println("The value of mins is : "+min);
   System.out.println("Year : "+year);
    System.out.println("Days : "+days);



  



    }
}