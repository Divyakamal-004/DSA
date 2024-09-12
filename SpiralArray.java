import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the dimension: ");
        int n=inp.nextInt();
        int m=inp.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("eneter the elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=inp.nextInt();
            }
        }
         int minr=0;
         int minc=0;
         int maxr=arr.length-1;
         int maxc=arr[0].length-1;
         int total=n*m;
         int count=0;
         while(count<total){
             for(int i=minc;i<=maxc && count<total;i++){
                 System.out.println(arr[minr][i]);
                 count++;
             }
             minr++;
             for(int i=minr;i<=maxr && count<total;i++){
                 System.out.println(arr[i][maxc]);
                 count++;
             }
             maxc--;
             for(int i=maxc;i>=minc && count<total;i--){
                 System.out.println(arr[maxr][i]);
                 count++;
             }
             maxr--;
             for(int i=maxr;i>=minr && count<total;i--){
                 System.out.println(arr[i][minc]);
                 count++;
             }
             minc++;
         }
    }
}
