
interface LuggageScanner{
    void scanLuggage();

    default void displaySecurityGuidelines(){
        System.out.println("Check luggage before boarding.");
    }
}
interface PassportVerifier{
    void verifyPassport();

    default void displaySecurityGuidelines(){
        System.out.println("Carry valid passport.");
    }

    static boolean isPassportNumberValid(String passportNo){
        return passportNo.length()==8;
    }
}
class AirportSecuritySystem implements LuggageScanner,PassportVerifier{

    public void scanLuggage(){
        System.out.println("Luggage Scanned.");
    }

    public void verifyPassport(){
        System.out.println("Passport Verified.");
    }

    public void displaySecurityGuidelines(){
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public static void main(String[] args){
        String[] names={"Aman","Riya","Karan"};
        String[] passports={"AB123456","123","XY987654"};

        AirportSecuritySystem a=new AirportSecuritySystem();

        for(int i=0;i<names.length;i++){
            boolean valid=PassportVerifier.isPassportNumberValid(passports[i]);
            System.out.println(names[i]+" -> "+(valid?"Can Board":"Cannot Board"));
        }
    }
}
