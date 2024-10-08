import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String str=inp.next();
        ArrayList<String> words=getKPC(str);
        System.out.println(words);
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch =str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> reres=getKPC(ros);
        ArrayList<String> myres=new ArrayList<>();
        String codeforch=codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode=codeforch.charAt(i);
            for(String rstr:reres){
                myres.add(chcode+rstr);
            }
        }
        return myres;

    }
}
