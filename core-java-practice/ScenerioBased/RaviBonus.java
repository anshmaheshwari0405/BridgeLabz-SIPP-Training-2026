public class RaviWelcomeCard {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 24;
        int rank = 5;
        int salary = 50000;
        float membershipFee = 299.99f;

        int annualBonus = (int) (salary * 0.12f);


        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + annualBonus);
        System.out.println("Welcome aboard, " + name + "!");
    }
}