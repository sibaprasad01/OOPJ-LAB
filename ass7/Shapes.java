
public class Shapes {
    int s;
    static int l , b;
    public static void rectangle(){
        System.out.println("The area of rectangle : "+(l*b));
    }
    public void square(){
        System.out.println("The area of square : "+(s*s));
    }
    public static void main(String[] args) {
        Shapes sh  = new Shapes();
       l = 12;
       b = 12;
       rectangle();
       sh.s = 5;
       sh.square();

    }
    
}
