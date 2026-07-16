import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double op1 = a+b*c;
        double op2 = a*b+c;
        double op3 = c + a/b;
        double op4 = a%b +c;

        System.out.printf("The result of the int operations are %.2f, %.2f, %.2f, and %.2f", op1, op2, op3, op4);
        sc.close();
    }
}
