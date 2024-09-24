import java.util.Scanner;

public class Knapsack01 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("enter the no. of items: ");
        int n=inp.nextInt();
        int[] val=new int[n];
        int[] weight=new int[n];
        System.out.println("enter the values: ");
        for(int i =0;i<val.length;i++){
            val[i]=inp.nextInt();
        }
        System.out.println("enter the weight: ");
        for(int i=0;i<weight.length;i++){
            weight[i]=inp.nextInt();
        }
        System.out.println("enter the capacity of knapsack: ");
        int capacity=inp.nextInt();

        int[][] sack=new int[n+1][capacity+1];
        for(int i=1;i<sack.length;i++){
            for(int j=1;j<sack[0].length;j++){
                if(j>=weight[i-1]){
                    if(sack[i-1][j-weight[i-1]]+val[i-1]>sack[i-1][j]){
                        sack[i][j]=sack[i-1][j-weight[i-1]]+val[i-1];
                    }else{
                        sack[i][j]=sack[i-1][j];  //when new item doesnt get in the sack
                    }
                }else{
                    sack[i][j]=sack[i-1][j];   //when new item doesnt get in the sack
                }
            }
        }
        System.out.println(sack[n][capacity]);
    }
}
