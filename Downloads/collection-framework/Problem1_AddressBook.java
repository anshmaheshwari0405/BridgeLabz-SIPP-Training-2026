import java.util.*;
class Contact implements Comparable<Contact>{
    String name,phone,email;
    Contact(String n,String p,String e){name=n;phone=p;email=e;}
    public int compareTo(Contact c){return name.compareToIgnoreCase(c.name);}
    public String toString(){return name+" | "+phone+" | "+email;}
}
public class Problem1_AddressBook{
    static ArrayList<Contact> contacts=new ArrayList<>();
    static HashMap<String,Contact> lookup=new HashMap<>();
    static HashSet<String> phones=new HashSet<>();
    static void add(String n,String p,String e){
        if(!phones.add(p)){System.out.println("Duplicate phone");return;}
        Contact c=new Contact(n,p,e);contacts.add(c);lookup.put(n,c);
    }
    static void search(String n){System.out.println(lookup.getOrDefault(n,null));}
    static void delete(String n){
        Contact c=lookup.remove(n);
        if(c!=null){contacts.remove(c);phones.remove(c.phone);}
    }
    static void display(){
        Collections.sort(contacts);
        for(Contact c:contacts)System.out.println(c);
    }
    public static void main(String[] args){
        add("Rahul","111","r@mail.com");add("Ankit","222","a@mail.com");add("Zoya","333","z@mail.com");
        search("Ankit");delete("Rahul");display();
    }
}