import java.util.ArrayList;
import java.util.Scanner;

public class Stairpath {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        ArrayList<String> paths=getPath(n);
        System.out.println(paths);

    }
    static ArrayList<String> getPath(int n){
        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }else if(n<0){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1=getPath(n-1);
        ArrayList<String> paths2=getPath(n-2);
        ArrayList<String> paths3=getPath(n-3);
        ArrayList<String> paths=new ArrayList<>();
        for(String path:paths1){
            paths.add(1+path);
        }
        for(String path:paths2){
            paths.add(2+path);
        }
        for(String path:paths3){
            paths.add(3+path);
        }
        return paths;
    }
}
