class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        
    }


    double getPerimeter() {
        return 2 * 3.141 * radius;
        
    }

   
    double getArea() {
        return 3.141 * radius * radius;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Perimeter of Circle: " + c.getPerimeter());
    }
}
