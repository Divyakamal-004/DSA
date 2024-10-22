public class Ceiling {
    public static void main(String[] args) {
        //in this program we have to find the target or number which is just greater than the target in the given sorted array
        int[] arr={-58,-46,-36,-29,-9,-5,4,7,17,45,69,88};
        int target=68;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
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
        //we just have to return the start as it violates while loop to get just greater number than the target
        return arr[start];
    }
}
