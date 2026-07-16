import java.util.*;
public class OTPGenerator {

    public static int generateOTP() {

        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean areUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {

            for (int j = i + 1; j < otpArray.length; j++) {

                if (otpArray[i] == otpArray[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otpArray));

        if (areUnique(otpArray))
            System.out.println("All OTPs are Unique");
        else
            System.out.println("Duplicate OTP Found");

    }
}