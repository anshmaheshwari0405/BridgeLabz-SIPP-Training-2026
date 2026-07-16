public class PenDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int student = 3;

        int penEachStudent = pens/student;
        int pensLeft = pens%student;

        System.out.println("The pen per student is " + penEachStudent + " and the remaining pen not distributed is " + pensLeft);
    }
}