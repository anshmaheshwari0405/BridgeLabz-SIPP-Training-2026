import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int op1 = a+b*c;
        int op2 = a*b+c;
        int op3 = c + a/b;
        int op4 = a%b +c;

        System.out.printf("The result of the int operations are %d, %d, %d, and %d", op1, op2, op3, op4);
        sc.close();
    }
}
