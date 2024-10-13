import java.util.ArrayList;
import java.util.Scanner;

public class MazeJump {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("destination row and column: ");
        int n = inp.nextInt();
        int m = inp.nextInt();
        System.out.println("enter the source address: ");
        int sr=inp.nextInt();
        int sc=inp.nextInt();
        ArrayList<String> paths = MazeJump(sr, sc, n, m);
        System.out.println(paths);

    }

    public static ArrayList<String> MazeJump(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        //horizontal moves
        for (int ms = 1; ms < dc - sc; ms++) {
            ArrayList<String> hpaths = MazeJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        //verticle moves
        for (int ms = 1; ms < dr - sr; ms++) {
            ArrayList<String> vpaths = MazeJump(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }
        //diagonal mover
        for (int ms = 1; ms < dr - sr && ms < dc - sc; ms++) {
            ArrayList<String> dpaths = MazeJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}