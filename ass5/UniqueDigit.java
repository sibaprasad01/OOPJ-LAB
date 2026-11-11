import java.lang.*;
import java .util.*;
class UniqueDigit{
public static void main(String args[]){
int i,j,k;
int count = 0;
for(i=1;i<=3;i++){
for(j=1;j<=3;j++){
for(k=1;k<=3;k++){
if(i!=j&&i!=k&&j!=k){
int number = i*100+j*10+k;
System.out.println(number);
count++;
}
}
}
}
System.out.println("The Number of elements : "+count);
}
}