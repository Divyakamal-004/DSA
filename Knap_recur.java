import java.util.Scanner;

public class Knap_recur {
    public static void main(String[] args) {
        int[] weights={1,2,4,2,5};
        int[] values={5,3,5,3,2};
        int capacity=10;
        int n=weights.length;
        int max=knapsack(weights,values,capacity,n);
        System.out.println(max);

    }
    public static int knapsack(int[] wt,int[] val,int cap,int n){
        if(n==0 || cap==0){
            return 0;
        }
        if(wt[n-1]>cap){
            return knapsack(wt,val,cap,n-1);
        }
        else{
            int wival=val[n-1]+knapsack(wt,val,cap-wt[n-1],n-1);
            int withval=knapsack(wt,val,cap,n-1);
            if(wival>withval){
                return wival;
            }else return withval;
        }
    }
}
