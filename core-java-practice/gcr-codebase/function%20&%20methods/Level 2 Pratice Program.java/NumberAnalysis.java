import java.util.*;
public class NumberAnalysis {

    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int n1, int n2) {

        if (n1 > n2)
            return 1;
        else if (n1 == n2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {

            if (!isPositive(n)) {
                System.out.println(n + " Negative");
            } else {

                if (isEven(n))
                    System.out.println(n + " Positive Even");
                else
                    System.out.println(n + " Positive Odd");
            }
        }

        int result = compare(arr[0], arr[4]);

        if (result == 1)
            System.out.println("First element is Greater");
        else if (result == 0)
            System.out.println("Both elements are Equal");
        else
            System.out.println("First element is Smaller");
        sc.close();
    }
}