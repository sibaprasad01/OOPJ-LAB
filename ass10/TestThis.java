class TestThis{
    int a , b , c;
    public TestThis(int a ){
        this.a = a;
    }
    public TestThis(int a , int b, int c){
        this(a);
        this.b=b;
        this.c = c;

    }
    void print(){
        System.out.println("Numbers are : "+a+" "+b+" "+c);
    }
    void display(){
        this.print();
        System.out.println("printing done");
    }
    public static void main(String[] args) {
        TestThis t = new TestThis(1, 2, 3);
        t.display();
    }
}