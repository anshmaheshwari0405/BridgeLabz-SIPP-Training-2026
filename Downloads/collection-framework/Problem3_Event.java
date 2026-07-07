import java.util.*;
public class Problem3_Event{
 HashSet<String> participants=new HashSet<>();
 void register(String e){
   if(participants.add(e))System.out.println("Registered "+e);
   else System.out.println("Duplicate "+e);
 }
 void display(){for(String s:participants)System.out.println(s);System.out.println("Total="+participants.size());}
 public static void main(String[]a){
  Problem3_Event e=new Problem3_Event();
  e.register("a@mail.com");e.register("b@mail.com");e.register("a@mail.com");e.display();
 }}