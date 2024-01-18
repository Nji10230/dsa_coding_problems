import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class duplicatearray {
    public static void main(String[] args) {
        int []arr={1,2,2,3,5,6};
        int n=1;

        System.out.println(findDuplicate(arr,n));

    }
    public static int findDuplicate(int []arr, int n){
        int start=0;
        int b=0;
        int end= arr.length;
       for(int i=0;i<arr.length;i++){
           for (int j = i+1; j < arr.length-1; j++) {
               if(arr[i]==arr[j]){
                   start=1;
                   b=arr[i];
                   break;
               }
              // return start;
           }
       }
       if(start==1)
           return b;
      // return -1;


        return -1;
    }

}
