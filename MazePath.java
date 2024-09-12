import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
         System.out.println("enter the destination address");
         int n =inp.nextInt();
         int m =inp.nextInt();
         System.out.println("enter the source address");
         int sr=inp.nextInt();
         int sc=inp.nextInt();
        ArrayList<String> paths= getMaze(sr,sc,m,n);
        System.out.println(paths);
    }
    //sr-source row
    //sc-source column
    //dr-destination row
    //dc-destination column
    public static ArrayList<String> getMaze(int sr,int sc,int dr,int dc){
        if(sr==dr&&sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        ArrayList<String> hpaths=new ArrayList<>();
        ArrayList<String> vpaths= new ArrayList<>();

        if(sc<dc){
            hpaths=getMaze(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpaths=getMaze(sr+1,sc,dr,dc);
        }

        ArrayList<String> paths=new ArrayList<>();

        for(String hpath:hpaths){
            paths.add("h"+hpath);
        }
        for(String vpath:vpaths){
            paths.add("v"+vpath);
        }
        return paths;
    }
}
