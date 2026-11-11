import java.lang.*;
import java .util.*;
class Dublicate{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int n =  sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Elements : ");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
for(int i = 0;i<n-1;i++){
for(int j = i+1;j<n;j++){
if(arr[i]==arr[j]){
System.out.println("Dublicate element : "+arr[j]);
}
}
}
}
}