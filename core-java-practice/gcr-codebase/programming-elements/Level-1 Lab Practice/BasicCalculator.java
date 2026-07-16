import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double product = num1*num2;
        double division = num2 != 0 ? num1/num2 : 0;
        
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.5f",
        num1, num2, addition, subtraction, product, division);
    }
}
