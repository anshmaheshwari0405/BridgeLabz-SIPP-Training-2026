abstract class RescueTeam{
    String teamId,location;
    RescueTeam(String i,String l){teamId=i;location=l;}
    abstract void performDuty();
}
class MedicalTeam extends RescueTeam{MedicalTeam(String i,String l){super(i,l);}void performDuty(){System.out.println(teamId+" Medical Aid");}}
class FireRescueTeam extends RescueTeam{FireRescueTeam(String i,String l){super(i,l);}void performDuty(){System.out.println(teamId+" Fire Rescue");}}
class FoodSupplyTeam extends RescueTeam{FoodSupplyTeam(String i,String l){super(i,l);}void performDuty(){System.out.println(teamId+" Food Supply");}}
public class Problem7_DisasterRescue{
    static void findTeamByLocation(RescueTeam[] t,String loc){for(RescueTeam x:t)if(x.location.equals(loc))System.out.println(x.teamId);}
    static void displayTeamsByPrefix(RescueTeam[] t,String p){for(RescueTeam x:t)if(x.teamId.startsWith(p))System.out.println(x.teamId);}
    public static void main(String[] args){
        RescueTeam[] t={new MedicalTeam("M1","North"),new FireRescueTeam("F1","South"),new FoodSupplyTeam("FD1","North"),new MedicalTeam("M2","East")};
        int m=0,f=0,fd=0;
        for(RescueTeam x:t){x.performDuty();if(x instanceof MedicalTeam)m++;else if(x instanceof FireRescueTeam)f++;else fd++;}
        findTeamByLocation(t,"North");displayTeamsByPrefix(t,"M");
        System.out.println("Medical="+m+" Fire="+f+" Food="+fd);
        String max=(m>=f&&m>=fd)?"Medical":(f>=fd?"Fire":"Food");
        System.out.println("Max="+max);
    }
}
