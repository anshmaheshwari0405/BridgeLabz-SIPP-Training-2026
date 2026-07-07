import java.util.*;
public class Problem5_Playlist{
 LinkedList<String> list=new LinkedList<>();
 void play(String song){
   list.remove(song);
   list.addFirst(song);
   if(list.size()>10)list.removeLast();
 }
 void search(String s){System.out.println(list.contains(s));}
 void display(){for(String s:list)System.out.println(s);}
 public static void main(String[]a){
  Problem5_Playlist p=new Problem5_Playlist();
  for(int i=1;i<=12;i++)p.play("Song"+i);
  p.search("Song10");p.display();
 }}