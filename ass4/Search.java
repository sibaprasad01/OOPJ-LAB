import java.lang.*;
class Search{
public static void binarySearch(int[] nums , int n){
int lb = 0;
int ub = nums.length-1;
int mid = (lb+ub)/2;
while(mid !=n){
if(mid==n){
 System.out.println("number found at index "+mid);
}
else if(mid >n){
 lb = mid+1;
}
else{
ub = mid - 1;\
}
 }
    }
public static void main(String args[]){
  double  e = 0;
  for(int i = 0 ; i<=5 ; i++){
    e = e + (1/(fact(i)));
   }
    System.out.println("The value of e upto 5 = "+e);
}
}