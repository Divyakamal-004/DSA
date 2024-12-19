public class SortOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,5};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr, int idx){
        //base condition
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx] < arr[idx+1] && sorted(arr, idx+1);
    }
}
