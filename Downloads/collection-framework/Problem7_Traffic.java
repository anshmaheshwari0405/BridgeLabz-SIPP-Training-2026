import java.util.*;
public class Problem7_Traffic{
 HashMap<String,Integer> roads=new HashMap<>();
 void update(String r,int c){roads.put(r,roads.getOrDefault(r,0)+c);}
 void report(){
   TreeMap<String,Integer> sorted=new TreeMap<>(roads);
   String busy="";int max=-1;
   for(String r:sorted.keySet()){
      int v=sorted.get(r);
      System.out.println(r+" : "+v);
      if(v>max){max=v;busy=r;}
   }
   System.out.println("Busiest Road="+busy);
   System.out.println("Roads Monitored="+roads.size());
 }
 public static void main(String[]a){
  Problem7_Traffic t=new Problem7_Traffic();
  t.update("Alpha Road",120);t.update("Central Road",350);t.update("Beach Road",200);t.update("Central Road",50);
  t.report();
 }}