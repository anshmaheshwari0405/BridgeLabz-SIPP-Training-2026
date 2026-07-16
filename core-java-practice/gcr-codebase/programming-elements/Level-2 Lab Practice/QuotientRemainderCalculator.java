import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double quotient = (double)num1/(double)num2;
        int remainder = num1%num2;
        System.out.printf("The quotient is %.2f and Remainder is %d of the two numbers %d and %d", quotient, remainder, num1, num2);

        sc.close();
    }
}
