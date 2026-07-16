import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        try {
            System.out.println("Accessing index 5:" + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}