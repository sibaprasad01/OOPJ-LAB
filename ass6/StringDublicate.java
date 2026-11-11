import java.lang.*;
import java .util.*;
class StringDublicate{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array1");
int n =  sc.nextInt();
String[] arr1 = new String[n];

System.out.println("Enter the size of an array2");
int m =  sc.nextInt();
String[] arr2 = new String[m];

System.out.println("Enter Elements for array 1 : ");
for(int i=0;i<n;i++){
arr1[i] = sc.next();
}

System.out.println("Enter Elements for array 2 : ");
for(int i=0;i<n;i++){
arr2[i] = sc.next();
}

String comman[] = new String[n];
   int k=0;

for(int i=0;i<n;i++){
   for(int j = 0; j<m ; j++){
      if(arr1[i].equals(arr2[i])){
        comman[k] = arr1[i];
          k++;
         break;
}
}
}
   for(int i=0;i<comman.length;i++){
       
System.out.println(comman[i]+" ");


}
}
}