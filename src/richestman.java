public class richestman {
    public static void main(String[] args) {
        int [][]arr={{6,2},{3,4}};
       // int sum=0;
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                     sum+=arr[i][j];

            }
            if(ans>sum){
                ans=sum;
            }
            //System.out
        }
        System.out.println(ans);
    }
}
