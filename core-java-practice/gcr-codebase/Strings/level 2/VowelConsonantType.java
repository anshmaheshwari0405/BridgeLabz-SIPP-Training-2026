import java.util.Scanner;
public class VowelConsonantType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            String type;
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') type = "Vowel";
                else type = "Consonant";
            } else type = "Not a Letter";
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = type;
        }
        System.out.println("Character\tType");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
        sc.close();
    }
}