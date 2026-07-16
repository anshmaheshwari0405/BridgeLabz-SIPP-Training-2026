import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) 
        {
            int formulaSum = n * (n + 1) / 2;

            int whileSum = 0;
            int counter = 1;

            while (counter <= n) 
            {
                whileSum += counter;
                counter++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

            if (formulaSum == whileSum) 
            {
                System.out.println("Both computations are correct.");
            } 
            else 
            {
                System.out.println("The computations do not match.");
            }
        } 
        else 
        {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}