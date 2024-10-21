public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-24,-17,-5,2,6,7,13,15,20,23,29,67,69};
        int target=67;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if the element is not found
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
        return -1;
    }
}
