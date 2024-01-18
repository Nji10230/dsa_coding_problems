import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class recursionpractice {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //   int n=sc.nextInt();
        int[] arr = {10 ,20 ,10 ,10 ,30 ,50,10,20,20,20,3,4 };
        System.out.println(socks(arr));

//
    }

    public static int socks(int[] arr) {
        int pairs = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; ) {
           // for (int j =i+1; j <arr.length; j++) {
                if (arr[i] == arr[i+1]) {
                    pairs++;
                    i=i+2;

                }else{
                    i++;
                }
        }
        return pairs;


    }
}


