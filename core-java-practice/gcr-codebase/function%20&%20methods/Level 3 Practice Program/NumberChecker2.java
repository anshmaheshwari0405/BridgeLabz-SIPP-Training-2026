import java.util.*;
public class NumberChecker2 {
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static int[] getDigitsArray(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int sumOfDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double sumOfSquares(int[] digits) {

        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {

        int digitSum = sumOfDigits(digits);

        return number % digitSum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("\nDigits Array:");

        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println("\n\nCount of Digits = " + countDigits(number));

        System.out.println("Sum of Digits = " +
                sumOfDigits(digits));

        System.out.println("Sum of Squares of Digits = " +
                sumOfSquares(digits));

        if (isHarshadNumber(number, digits))
            System.out.println(number + " is a Harshad Number");
        else
            System.out.println(number + " is NOT a Harshad Number");

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency");
        System.out.println("Digit\tFrequency");

        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        frequency[i][0] + "\t" +
                        frequency[i][1]);
            }
        }

        sc.close();
    }
}