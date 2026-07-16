import java.util.*;
public class FootballTeam {

    static int sum(int[] arr) {
        int sum = 0;
        for(int n : arr) sum += n;
        return sum;
    }

    static double meanHeight(int[] arr) {
        return (double)sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {
        int min = arr[0];
        for(int n : arr)
            min = Math.min(min, n);
        return min;
    }

    static int tallest(int[] arr) {
        int max = arr[0];
        for(int n : arr)
            max = Math.max(max, n);
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        for(int i=0;i<11;i++)
            heights[i] = (int)(Math.random()*101)+150;

        System.out.println(Arrays.toString(heights));
        System.out.println("Mean = " + meanHeight(heights));
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
    }
}