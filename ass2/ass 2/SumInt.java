import java.lang.*;
public class SumInt{
public static void main(String[] args){
    int num = 121;
    System.out.println("The three digiit number is "+num);
    int sum = 0;
    while(num != 0){
    int digit =  num % 10;
        sum = sum + digit;
        num = num / 10;
     }
    System.out.println("The sum of three digit number is  "+sum);



    }
}