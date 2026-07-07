import java.util.*;
public class Problem4_Attendance{
 HashMap<String,ArrayList<String>> map=new HashMap<>();
 void mark(String sub,String stu){
   map.putIfAbsent(sub,new ArrayList<>());
   if(!map.get(sub).contains(stu))map.get(sub).add(stu);
 }
 void display(){
   for(String s:map.keySet()){
      System.out.println(s+" -> "+map.get(s));
      System.out.println("Total="+map.get(s).size());
   }
 }
 public static void main(String[]a){
  Problem4_Attendance t=new Problem4_Attendance();
  t.mark("Java","Alice");t.mark("Java","Bob");t.mark("Java","Alice");t.mark("DBMS","Carol");t.display();
 }}