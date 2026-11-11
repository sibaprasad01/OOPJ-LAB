import java.util.*;
public class CommanElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1 :");
        int n1 = sc.nextInt();
         System.out.println("Enter the size of array 2 :");
        int n2 = sc.nextInt();
        sc.nextLine();
        String[] arr1 = new String[n1];
        String[] arr2 = new String[n2];
        String[] comman = new String[n1];
        System.out.print("Enter elementd for array 1 ");
        for(int i = 0;i<n1;i++){
            arr1[i]= sc.nextLine();
        }
        System.out.print("Enter elementd for array 2 ");
        for(int i = 0;i<n2;i++){
            arr2[i]= sc.nextLine();
        }
        int k = 0;
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {

                if (arr1[i].equals(arr2[j])) {
                    comman[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        System.out.println("Common elements are : ");
        for(int i = 0;i<k;i++){
            System.out.print(comman[i]+" ");
        }

        sc.close();
    }
}