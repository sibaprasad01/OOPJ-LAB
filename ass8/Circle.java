class Circle{
    double radius;
    public void input(int r){
        radius = r;
    }
    public void calculate(){
        System.out.println("The area of circle : "+(3.141*radius*radius));
        System.out.println("The circumference of circle : "+(2*3.141*radius));
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.input(3);
        c.calculate();
    }
}