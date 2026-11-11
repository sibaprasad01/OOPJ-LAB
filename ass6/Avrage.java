import java.lang.*;
import java .util.*;
class Avrage{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int n =  sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Elements : ");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
int sum = 0;
for(int i=0;i<n;i++){
sum = sum+arr[i];
}
System.out.println("The Sum of elements : "+sum);
System.out.println("The Avrage of elements : "+(sum/n));



}
}