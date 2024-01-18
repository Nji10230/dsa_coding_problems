public class evendigits {
    public static int countno(int arr){
        int count=0;
        while (arr>0){
            count++;
            arr=arr/10;

        }
        return count;
    }
    public static boolean even(int arr){
        int noofdigits=countno(arr);
        return  noofdigits%2==0;

    }
    public static int evd(int []arr){
       int c1=0;
        for (int j : arr) {
            if (even(j)) {
                c1++;

            }
        }
          return c1;

    }
    public static void main(String[] args) {
        int []arr={12,3,345,3456};
       //evendigits.evd(arr);
       System.out.println(evd(arr));
        System.out.println(countno(54678));

    }

}
