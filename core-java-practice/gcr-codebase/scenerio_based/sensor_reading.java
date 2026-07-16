package gcr_codebase.recursion.scenerio_based;
import java.util.*;
public class sensor_reading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isincreasing=true;
        boolean ans=find(arr,1,isincreasing);
        System.out.print(ans);
    }
    public static boolean find(int[]arr,int idx,boolean isincreasing){
        if(idx==arr.length){
            return true;
        }
        if(arr[idx]>arr[idx-1]){
             return find(arr,idx+1,true);
        }
        
        return false;


        }
    }
    

