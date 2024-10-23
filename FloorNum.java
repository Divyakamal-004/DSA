public class FloorNum {
    public static void main(String[] args) {
       //in this program we have to find the number which is just smaller or equal to target in the given sorted array
       int[] arr={-69,-50,-44,-30,-16,7,13,29,33,56};
       int target=12;
       int ans=binarySearch(arr,target);
       System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        if(target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find the middle element
            //          int mid=(start+end)/2;  //might pe possible the start+end integer value may be exceeded in case of very large values
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //target found
                return mid;
            }
        }
        //we just have to return the end as it violates while loop to get just lower number than the target
        return arr[end];
    }
}
