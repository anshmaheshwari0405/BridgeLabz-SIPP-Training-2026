package gcr_codebase.recursion.scenerio_based;
import java.util.*;
public class employee_skill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n=sc.nextInt();
        System.out.print("enter array elements:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter target :");
        int t=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        check(arr,0,t,list);
        


    }
    public static void check(int[]arr,int idx,int t,List<Integer>list){
        if(t==0){
            int[]ans= new int[list.size()];
            for(int i=0;i<ans.length;i++){
                ans[i]=list.get(i);
                System.out.print(ans[i]+" ");

            }
            System.out.println();
            return ;
        }
        for(int i=idx;i<arr.length;i++){
            if(t-arr[i]>=0){
                t=t-arr[i];
                list.add(arr[i]);
                check(arr,i+1,t,list);
                t=t+arr[i];
                list.remove(list.size()-1);

            }
        }
        
    }
}   
    
