import java.util.Random;
public class StudentScorecard {
    public static void main(String[] args) {
        int students=5;
        int[][] scores=new int[students][3];
        Random rand=new Random();
        for(int i=0;i<students;i++){
            for(int j=0;j<3;j++){
                scores[i][j]=rand.nextInt(90)+10;
            }
        }
        int[] total=new int[students];
        double[] avg=new double[students];
        double[] per=new double[students];
        String[] grade=new String[students];
        for(int i=0;i<students;i++){
            total[i]=scores[i][0]+scores[i][1]+scores[i][2];
            avg[i]=Math.round((total[i]/3.0)*100.0)/100.0;
            per[i]=Math.round(((total[i]/300.0)*100)*100.0)/100.0;
            grade[i]=per[i]>=80?"A":per[i]>=70?"B":per[i]>=60?"C":per[i]>=50?"D":per[i]>=40?"E":"R";
        }
        System.out.println("Student Physics Chemistry Math Total Average Percentage Grade");
        for(int i=0;i<students;i++){
            System.out.println((i+1)+"\t"+scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+total[i]+"\t"+avg[i]+"\t"+per[i]+"\t"+grade[i]);
        }
        
    }
}