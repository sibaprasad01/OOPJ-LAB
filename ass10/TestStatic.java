
public class TestStatic{
      static String university = "giet";
  static{
        System.out.println("Static block is running");
        }
        public static void getMe(){
            System.out.println("My university name is :"+university);
  }
    public static void main(String[] args) {
        System.out.println("main is running");
        getMe();
    }
}