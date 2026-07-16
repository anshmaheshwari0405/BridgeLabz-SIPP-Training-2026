public class FeeDiscountCalculator {
    public static void main(String[] args) {
        int studentFee = 125000;
        int discountPercent = 10;

        float discount = (float)studentFee/discountPercent;
        float finalfees = studentFee - discount;

        System.out.println("The discount amount is INR " + discount + " and the final discounted fees is INR " + finalfees);


    }
}