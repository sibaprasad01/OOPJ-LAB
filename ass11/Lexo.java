import java.util.*;
class Lexo{
    public static void main(String[] args) {
        String s1 ,s2;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter string S1");
        s1 = sc.nextLine();
         System.out.println("Enter string S2");
        s2 = sc.nextLine();
        sc.close();
        if(s1.length()!=s2.length()){
            System.out.println("Both strings are not equal");
            return;
        }
        
        int a = s1.compareTo(s2);
       if(a<0){
        System.out.println(s1+" is less than "+s2);
       }
        else if(a>0){
        System.out.println(s1+" is more than "+s2);
       }
         else{
        System.out.println(s1+" is lexographically equal to "+s2);
       }
      


        
    }
}