public class Permutation_2 {
    public static void main(String[] args) {
     permutation("","abc");
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String fir=p.substring(0,i);
            String sec=p.substring(i,p.length());
            permutation(fir+ch+sec,up.substring(1));
        }
    }
}
