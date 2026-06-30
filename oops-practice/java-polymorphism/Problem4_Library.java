abstract class LibraryMember{
    String memberName,memberId;
    LibraryMember(String n,String id){memberName=n;memberId=id;}
    abstract double calculateFine(int d);
    void print(){System.out.println(memberName+" "+memberId);}
}
class StudentMember extends LibraryMember{StudentMember(String n,String i){super(n,i);}double calculateFine(int d){return d*2;}}
class FacultyMember extends LibraryMember{FacultyMember(String n,String i){super(n,i);}double calculateFine(int d){return d;}}
class GuestMember extends LibraryMember{GuestMember(String n,String i){super(n,i);}double calculateFine(int d){return d*5;}}
public class Problem4_Library{
    public static void main(String[] args){
        LibraryMember[] m={new StudentMember("A","S1"),new FacultyMember("B","F1"),new GuestMember("C","G1")};
        String key="F1";
        for(LibraryMember x:m){x.print();System.out.println(x.calculateFine(4));if(x.memberId.equals(key))System.out.println("Found "+x.memberName);}
    }
}
