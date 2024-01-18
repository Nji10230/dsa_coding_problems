import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int []arr={2,1,4,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int []arr){
        for (int i = 0; i < arr.length;) {
            int correct=arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,correct);

            }else {
                i++;
            }

        }
    }

    private static void swap(int[] arr , int start , int second) {
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }
}
