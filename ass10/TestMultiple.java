interface A{
    int a = 5;
}
interface B{
    int b = 10;
}

public class TestMultiple implements A ,B{
    int sum = a+b;
    void display(){

        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        TestMultiple t = new TestMultiple();
        t.display();
    }

    
}