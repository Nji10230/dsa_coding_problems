public class binarysearch3 {
    public static void main(String[] args) {
        int []ch={'c','e','h','m'};
        int target='f';
        int c=charbinarysearch(target,ch);
        //char z=char(c);
        //System.out.println();
       System.out.println((char)c);
    }
    static int charbinarysearch( int target,int []ab){
        int start = 0;
        int end = ab.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target> ab[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ab[start % ab.length];
       // System.out.println(ab[start % ab.length]);




    }
}
