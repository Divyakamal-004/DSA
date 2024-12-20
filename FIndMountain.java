public class FIndMountain {
    public static void main(String[] args) {
        int[] arr={4,6,8,9,19,15,12,8,7,5};
        int target=8;
        int ans= search(arr,target);
        System.out.println(ans);

    }
   static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderBS(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid] >arr[mid+1]){
                end =mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderBS(int[] arr,int target,int start,int end){

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
