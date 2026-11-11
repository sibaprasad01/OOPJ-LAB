class Bank{
    double ROI = 0;
    public void getROI(){
        System.out.println("The return of invest is : "+ROI);
    }
}
    class Sbi extends Bank{
        double ROI = 8.4;
         public void getROI(){
        System.out.println("The return of invest is : "+ROI);
    }
    }
     class Icic extends Bank{
        double ROI = 7.3;
        
         public void getROI(){
      
             System.out.println("The return of invest is : "+ROI);
    }
     }
     class Axis extends Bank{
        double ROI = 9.7;
         public void getROI(){
        System.out.println("The return of invest is : "+ROI);
    }
        
    }
    public class TestBank{
    public static void main(String[] args) {
        Sbi s =  new Sbi();
       s.getROI();
       Icic i = new Icic();
       i.getROI();
       Axis a = new Axis();
       a.getROI();

    }
    }
    
