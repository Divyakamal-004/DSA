public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,33,55,67,69,12,48,90};
        int target=99;
        int index=LinearS(arr,target);
        System.out.println(index);

    }
    static int LinearS(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
