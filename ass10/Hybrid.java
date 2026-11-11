class Animal{
    void sound(){
        System.out.println("Animal makes sounds");
    }
}
    class Dog extends Animal{
        void sound(){
            System.out.println("Dog barks");
        }
    }
    class Puppy extends Dog{
        void sound(){
            System.out.println("dogs cant bark");
        }
    }
    class Cat extends Animal{
        void sound(){
            System.out.println("Cat meows");
            
        }
    }
    public class Hybrid{
        public static void main(String[] args) {
            Cat c = new Cat();
            c.sound();
            Dog d  = new Dog();
            d.sound();

        }
    }
