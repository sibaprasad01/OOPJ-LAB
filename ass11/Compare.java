import java.util.*;
public class Compare {
    
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string S1"); 
        s1 = sc.nextLine();
        System.out.println("Enter string S2");
        s2 = sc.nextLine();
        sc.close();
        if(s1.length()!=s2.length()){
            System.out.println("Both strings are not equal");
            return;
        }
        for(int i = 0 ; i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("Both strings are not equal");
                return;
            }
        }
        System.out.println("Both strings are equal");
    }
}
