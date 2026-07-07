import java.util.*;
public class Problem2_Parking{
 ArrayList<String> parked=new ArrayList<>();
 void enter(String r){if(!parked.contains(r)){parked.add(r);}}
 void exit(String r){parked.remove(r);}
 void search(String r){System.out.println(parked.contains(r)?"Present":"Not Present");}
 void display(){System.out.println(parked);System.out.println("Occupied="+parked.size());}
 public static void main(String[]a){
  Problem2_Parking p=new Problem2_Parking();
  p.enter("DL01");p.enter("DL02");p.enter("DL03");p.exit("DL02");p.search("DL03");p.display();
 }}