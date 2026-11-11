  import java.util.*;
 class Student {
    int rollno;
    String name;
    String course;
    public void display(){
        System.out.println("Roll no is : "+rollno);
        System.out.println("Name is : "+name);
        System.out.println("Course is : "+course);  
    }
    public void seletCourse(){
        System.out.println("chosse course");
        System.out.println("1 : java");
        System.out.println("2 : dbms");
        System.out.println("3 : ppml");   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice");
    int num = sc.nextInt();
    switch(num){
        case 1: 
            course = "java";
        break;
        case 2 :
            course = "dbms";
         break;
         case 3 : 
         course   = "ppml";
         break;
         default :
         System.out.println("Invalid choice");
    }
    sc.close();
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.rollno = 101;
        s.name = "John";
        s.seletCourse();
        s.display();
    }
    
}
