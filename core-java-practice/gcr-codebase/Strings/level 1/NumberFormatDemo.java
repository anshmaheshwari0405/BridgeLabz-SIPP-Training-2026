import java.util.Scanner;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        int num=Integer.parseInt(str);
        System.out.println("Number is: "+num);
        sc.close();
    }
}