
import java.lang.*;

class TriangleArea {

    public static void main(String[] args) {
        double a = 5.0;
        double b = 4.0;
        double c = 8.0;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle : " + area);

    }
}
