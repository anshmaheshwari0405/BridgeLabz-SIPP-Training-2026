
interface CouponValidator{
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code){
        return code.length()>=5;
    }
}
class ShoppingCart implements CouponValidator{
    public boolean validateCoupon(String code){
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }

    public static void main(String[] args){
        String[] coupons={"SAVE10","AB12","SAVE50","DISC"};
        ShoppingCart cart=new ShoppingCart();

        for(String c:coupons){
            System.out.println(c+" -> "+(cart.validateCoupon(c)?"Valid":"Invalid"));
        }
    }
}
