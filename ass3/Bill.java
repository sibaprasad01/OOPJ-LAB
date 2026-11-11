import java.util.*;

public class Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pr;
        System.out.println("Enter primary consumption : ");
        pr = sc.nextInt();
       System.out.println("Enter primary consumption : ");
        int cr  = sc.nextInt();
        int tr =  cr - pr;
        int bill;
        if(tr <=100){
      bill = tr * 3;
     } 
     else if(tr<=500){
    bill = (100*3)+(tr-100)*4;
    }
else{
      bill = 100*3+400*4+(tr-500)*6;
}
    System.out.println("The total bill : "+bill);



        
        sc.close();

    }
}
