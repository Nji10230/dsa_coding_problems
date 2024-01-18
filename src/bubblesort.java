import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr={1,4,3,2,5};
        bs(arr);
        System.out.println(Arrays.toString(arr));
                                                             //space complexity is O(1)
                                                            //worst case is O(N^2).best case is O(N);
    }
    static void bs(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;
                }
            }
        }
    }
}
