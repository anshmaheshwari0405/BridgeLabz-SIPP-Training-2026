import java.util.*;
public class NumberChecker3{

    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {

        int[] reverse = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {

        int[] reverseDigits = reverseArray(digits);

        return compareArrays(digits, reverseDigits);
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {

            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reverseDigits = reverseArray(digits);

        System.out.println("\nCount of Digits = " + digitCount);

        System.out.println("Digits Array = "
                + Arrays.toString(digits));

        System.out.println("Reversed Array = "
                + Arrays.toString(reverseDigits));

        if (compareArrays(digits, reverseDigits))
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");

        if (isPalindrome(digits))
            System.out.println(number + " is a Palindrome Number");
        else
            System.out.println(number + " is NOT a Palindrome Number");

        if (isDuckNumber(digits))
            System.out.println(number + " is a Duck Number");
        else
            System.out.println(number + " is NOT a Duck Number");

        sc.close();
    }
}