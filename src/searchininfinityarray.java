public class searchininfinityarray {
    public static void main(String[] args) {
        int []arr={2,3,6,8,9,11,13,20,23,26,27,30,32,35,36,39,40};
        int target=20;
        System.out.println(range(arr,target));

    }
    static int range(int []arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+((end-start)+ 1)*2;
            start=temp;
        }
        return bs(arr,target,start,end);

    }
    static int bs(int []arr,int target,int start,int end){
//        int start=0;
//        int end= arr.length-1;
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
