import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) 
        {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;

            for (int i = 1; i <= n; i++) 
            {
                forSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);

            if (formulaSum == forSum) 
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