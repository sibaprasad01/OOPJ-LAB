import java.lang.*;
class eValue{
public static void main(String args[] ){
int fact =1;
double e = 1.0;
for(int i=1;i<=5;i++){
fact = fact*i;
e=e+(1.0/fact);
}
System.out.println("The value of e is"+e);
}
}