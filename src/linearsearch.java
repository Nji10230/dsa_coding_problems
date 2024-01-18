public class linearsearch {
    public static void ls( int []b){
        int ans=b[0];
        for (int i=0;i<b.length;i++) {
            if (b[i]> ans) {
                ans=b[i];
            }

        }
        System.out.println(ans);


    }
    public static void main(String[] args) {
        int []arr={-1,-2,-3,-4,-5};
        //System.out.println(ls(arr));
       ls(arr);


    }
}
