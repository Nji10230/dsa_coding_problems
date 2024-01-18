import java.util.ArrayList;
import java.util.Collections;

public class trianglewithlargestperimeter {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        System.out.println(trianlgesum(arr));


    }
    public static int trianlgesum(ArrayList<Integer> arr){
        arr.sort(Collections.reverseOrder());

        for (int i = 0; i < arr.size() - 2; i++) {
            // Check if this is a valid triangle.
            if (arr.get(i) < arr.get(i + 1) + arr.get(i + 2)) {
                // This is the largest possible perimeter.
                return arr.get(i) + arr.get(i + 1) + arr.get(i + 2);
            }
        }

        // It is impossible to form a valid triangle.
        return 0;
    }
}
