public class Mountain {
    public static void main(String[] args) {
        int[] arr={0,2,5,6,3,1};
        int ans=peakIndex(arr);
        System.out.println(ans);

    }
    static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
