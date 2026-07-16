import java.util.*;
public class NumberChecker {

    static int countDigits(int n){
        return String.valueOf(n).length();
    }

    static int[] getDigits(int n){
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];

        for(int i=0;i<s.length();i++)
            digits[i] = s.charAt(i)-'0';

        return digits;
    }

    static boolean isDuck(int[] digits){
        for(int d : digits)
            if(d==0)
                return true;
        return false;
    }

    static boolean isArmstrong(int n,int[] digits){
        int power = digits.length;
        int sum = 0;

        for(int d:digits)
            sum += Math.pow(d,power);

        return sum==n;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digits Count = "+countDigits(n));
        System.out.println("Duck = "+isDuck(digits));
        System.out.println("Armstrong = "+isArmstrong(n,digits));
        sc.close();
    }
}