public class OrderAganosticBS {
    public static void main(String[] args) {
        int[] arr={-45,-34,-25,0,3,7,12,38,56,69};
        int target=12;
        int ans=orderBS(arr,target);
        System.out.println(ans);

    }
    static int orderBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        //find if the array is sorted into ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
