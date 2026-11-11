import java.lang.*;
import java .util.*;
class Sorting{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int n =  sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Elements : ");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j = 0;j<n-1-i;j++){
 if(arr[j]>arr[j+1]){
int temp  = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp; 
}
}
}
System.out.println("Bubble Sort Success");
System.out.println("Sorted Elements : ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}

}
}