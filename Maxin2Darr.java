public class Maxin2Darr {
    public static void main(String[] args) {
        int[][] arr={
                {7,8,9,99},
                {34,67,89,56},
                {46,95,67,69},
                {45,78,34,22},
        };
        int ans=max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
          for(int row=0;row<arr.length;row++){
             for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
