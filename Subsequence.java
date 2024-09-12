import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String str=inp.next();
        ArrayList<String> result=gss(str);
        System.out.print(result);
    }
    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
             ArrayList<String> bres=new ArrayList<>();
             bres.add(" ");
             return bres;
        }
            char ch = str.charAt(0);
            String ros = str.substring(1);//remove the rest of string from the first element then get the subsequence
            ArrayList<String> rres = gss(ros);//subsequence of rest of the string(bc)

            ArrayList<String> myres = new ArrayList<>();
            for (String rstr : rres) {
                myres.add(" " + rstr);
                myres.add(ch + rstr);
            }
            return myres;
        }
    }




