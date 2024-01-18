public class sumofinfinitearray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(suminfinitearray(arr));
    }
    public static int suminfinitearray(int []arr){
        int start=0;
        int end=1;
        int sum=0;
        while(start<end){
            int temp=end;
            sum+=arr[start];
            start=temp;
            //start=end;
            end++;
            if(start==6){
                break;
            }
        }

        return sum;

    }
}
