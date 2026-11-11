
import java.util.*;

public class ProfitAndLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the cost price : ");
      int cp = sc.nextInt();
      System.out.println("Enter your Sell price : ");
      int sp = sc.nextInt();
     if(sp>cp){
      int profit = sp - cp;
      int profitPercentage = (profit * 100)/cp;
       System.out.println("Profit : "+profit);
       System.out.println("Profit Percentage  : " +profitPercentage); 

      }   
       
     else if(sp<cp){
      int loss = cp - sp;
      int lossPercentage = (loss * 100)/cp;
       System.out.println("Loss : "+loss);
       System.out.println("Loss Percentage  : " +lossPercentage); 

      }   
      else{
            System.out.println("No Profit No loss");
         }

        sc.close();

    }
}
