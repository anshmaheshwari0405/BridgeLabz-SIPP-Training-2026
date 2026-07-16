package gcr_codebase.recursion.scenerio_based;
import java.util.*;
public class usernam_validate {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = sc.nextLine();
        boolean ans = check(username, 0);
        System.out.println("Is the username valid? " + ans);
    }
    public static boolean check(String input,int idx){
        if(idx==input.length()){
            return true;
        }
        char ch=input.charAt(idx);
        if(Character.isLetter(ch)){
            if(ch>='a' && ch<='z'){
                return check(input,idx+1);
            }
        }
        return false;
    } 

    
    }

