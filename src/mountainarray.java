public class mountainarray {
    public static void main(String[] args) {
        int []arr={2,4,5,6,5,4};
        int target=6;
        System.out.println(ma(arr,target));

    }
    static int ma(int []arr,int target){
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                index=i;
                break;
            }

        }
        return mountain(arr,target,index);
    }
    static int mountain(int []arr,int target,int index){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            }else {
                return mid;
            }


        }
        return -1;
    }
}
