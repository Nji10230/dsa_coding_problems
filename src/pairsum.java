import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class pairsum {
    public static void main(String[] args) {
       int []arr={1,2,3,3,4,5,1};
        int sum=8;
        uniqueelements(arr);
      //  pairSum(arr,sum);
     //   System.out.println(new pairsum(arr,sum));
      //  System.out.println(findDuplicate(arr));

        //System.out.println(pairSum(arr,sum));
    }
//    public static ArrayList<Integer> pairSum(int []arr,int sum) {
//            ArrayList<Integer>list =new ArrayList<>();
//
//      //  int[] newarray = new int[0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                   // int[] newArray={arr[i],arr[j]};
//                    return list.add(i);
//
//                   // l.add(newArray);
//                }
//            }
//        }
//        return list.add(-1);
//       // System.out.println(Arrays.toString(l.get(1)));
//    }
//    public static int findDuplicate(int[] arr){
//        int duplicate =0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    duplicate= arr[i];
//                    return duplicate;
//                }
//            }
//        }
//        return -1;
//    }
    public static void uniqueelements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }





    }
}
