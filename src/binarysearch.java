public class binarysearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,8};
        int target=5;
        System.out.println(bs(target,arr));



    }
       static int bs(int key,int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key>arr[mid]){
                start=mid+1;
            } else if (key<arr[mid]) {
                end=mid-1;

            }else {
                return mid;
            }


        }
        return -1;
    }
}
