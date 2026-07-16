import java.util.Scanner;
public class DayOfWeekCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1–12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1–31): ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;

        int dow = (d + x + (31 * mo) / 12) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of the week: " + days[dow]);

        sc.close();
    }
}