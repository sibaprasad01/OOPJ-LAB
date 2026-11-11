import java.util.*;
class pallindrome{
    public static void main(String[] args) {
        boolean ans = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.nextLine();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                ans = false;
                break;
            }
            i++;
            j--;
           
        }
        if(ans){
            System.out.println("pallindrome String");
        }
        else{
            System.out.println("not pallindrome string");
        }
        sc.close();

    }
}