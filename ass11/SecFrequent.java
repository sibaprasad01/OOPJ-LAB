import java.util.*;

public class SecFrequent {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter a String");
        Scanner sc  =  new Scanner(System.in);
        s = sc.nextLine();
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        int max = 0, second = 0;
        String result = " ";

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            if (count > max) {
                second = max;
                max = count;
            } else if (count > second && count < max) {
                second = count;
                result = result + arr[i];
            }
        }

        if (second == 0) {
            System.out.println("No second most frequent character");
        } else {
            System.out.println("Frequency: " + second);
            System.out.println("Character: " + result);
        }
    }
}