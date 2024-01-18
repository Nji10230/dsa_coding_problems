public class binarysearch2 {
    public static void main(String[] args) {
        int []arr={1,4,6,7,10};
        int key=3;
        //floorofanumber(key,arr);
        System.out.println(floorofanumber(key,arr));

    }
    static int floorofanumber(int key,int[] b) {
        int start = 0;
        int end = b.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key > b[mid]) {
                start = mid + 1;
            } else if (key < b[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return b[end];
    }

   // return end;
}
