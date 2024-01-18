import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxiindex=maxi(arr,0,last);
            swap(arr,maxiindex,last);
        }
    }
    public static int maxi(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;

            }
        }
        return max;
    }
    public static void swap(int[] arr,int maxiindex,int last){
        int temp=arr[last];
        arr[last]=arr[maxiindex];
        arr[maxiindex]=temp;

    }
}
