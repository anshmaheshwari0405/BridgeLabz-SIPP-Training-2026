import java.util.*;
class Astronaut{
 String astronautId,name,specialization;
 Astronaut(String i,String n,String s){astronautId=i;name=n;specialization=s;}
 public String toString(){return astronautId+" "+name+"("+specialization+")";}
}
public class Problem6_SpaceMission{
 HashMap<String,List<Astronaut>> missions=new HashMap<>();
 HashMap<String,HashSet<String>> ids=new HashMap<>();
 void addMission(String m){missions.put(m,new ArrayList<>());ids.put(m,new HashSet<>());}
 void assign(String m,Astronaut a){
   if(ids.get(m).add(a.astronautId))missions.get(m).add(a);
   else System.out.println("Duplicate assignment");
 }
 void display(){
   for(String m:missions.keySet()){
      System.out.println(m);
      for(Astronaut a:missions.get(m))System.out.println(a);
      System.out.println("Crew="+missions.get(m).size());
   }
 }
 public static void main(String[]a){
  Problem6_SpaceMission s=new Problem6_SpaceMission();
  s.addMission("Moon");s.addMission("Mars");
  s.assign("Moon",new Astronaut("A1","Neil","Pilot"));
  s.assign("Moon",new Astronaut("A2","Buzz","Engineer"));
  s.assign("Moon",new Astronaut("A1","Neil","Pilot"));
  s.assign("Mars",new Astronaut("A1","Neil","Pilot"));
  s.display();
 }}