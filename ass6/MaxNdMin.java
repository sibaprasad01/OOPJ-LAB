import java.lang.*;
import java .util.*;
class MaxNdMin{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int n =  sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Elements : ");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
int max = -1;
for(int i=0;i<n;i++){
if(arr[i]>max){
max = arr[i];
}
}
System.out.println("The maximum value for above array is   : "+max);
int min = max;
for(int i=0;i<n;i++){
if(arr[i]<min){
min = arr[i];
}
}
System.out.println("The minimum value for above array is   : "+min);
}
}