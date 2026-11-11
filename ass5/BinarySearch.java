import java.lang.*;
import java .util.*;
class BinarySearch{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int n =  sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Elements : ");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
int high = n-1;
int low = 0;
int found = -1;
System.out.println("Enter the Element to Search : ");
int key =  sc.nextInt();
while(low<=high){
int mid = (high+low)/2;
if(arr[mid]==key){
found = mid;
break;
}
else if(arr[mid] > key){
high = mid -1;
}
else if(arr[mid] < key){
low = mid + 1;
}
}
if(found != -1){
System.out.println("Element Found At Index  : "+found);
}
else{
System.out.println("Element not found");
}
}
}