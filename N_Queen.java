import java.util.Scanner;

public class N_Queen {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int n= inp.nextInt();
        int[][] chess=new int[n][n];
        printNqueens(chess,"",0);
    }

    //qsf=queen so far

    public static void printNqueens(int[][] chess,String qsf,int row){
        if(row==chess.length) {
            System.out.println(qsf+".");
            return;
        }
      for(int col=0;col<chess.length;col++){
          if(isitasafeplacefortheQueen(chess,row,col)==true) {
              chess[row][col] = 1;
              printNqueens(chess, qsf + row + "-" + col + ",", row + 1);
              chess[row][col] = 0;
          }
          }

      }
      public static boolean isitasafeplacefortheQueen(int[][] chess,int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
      }
    }

