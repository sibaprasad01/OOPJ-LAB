import java.util.*;
class Index{
    public static void main(String[] args) {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  string ");
        s1 =  sc.nextLine();
        for(int i = 0 ; i<s1.length();i++){
            System.out.println(i+" : "+s1.charAt(i));
            sc.close();
        }
    }
}