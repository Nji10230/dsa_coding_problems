import java.rmi.dgc.VMID;
import java.util.Arrays;

public class binarysearch4 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 5 , 8 , 8 , 10};    //first and last position of element in  sorted array
        int target = 8;
        System.out.println(Arrays.toString(fandl(target , arr)));
    }

    static int[] fandl(int target , int[] b) {
        int start = 0;
        int last = 0;
        int end = b.length-1;
        int first=0;
        while (start < end) {
            if (b[start] == target){
                first=start;
                break;
            }else {
                start++;
            }
            if(b[end]==target){
                last=end;
                break;
            }
            else {
                end--;
            }


        }
        return new int[]{first,last};
    }
}

