import java.util.*;
public class NumberChecker5 {

    public static int sumOfProperDivisors(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfect(int number) {

        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {

        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {

        return sumOfProperDivisors(number) < number;
    }

    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isStrong(int number) {

        int temp = number;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;
            sum += factorial(digit);

            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfect(number))
            System.out.println(number + " is a Perfect Number");
        else
            System.out.println(number + " is NOT a Perfect Number");

        if (isAbundant(number))
            System.out.println(number + " is an Abundant Number");
        else
            System.out.println(number + " is NOT an Abundant Number");

        if (isDeficient(number))
            System.out.println(number + " is a Deficient Number");
        else
            System.out.println(number + " is NOT a Deficient Number");

        if (isStrong(number))
            System.out.println(number + " is a Strong Number");
        else
            System.out.println(number + " is NOT a Strong Number");

        sc.close();
    }
}