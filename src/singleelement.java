public class singleelement {
    public static void main(String[] args) {
        int []arr={1,1,2,1,3,1,1};
        System.out.println(sorted(arr));

    }
    static int sorted(int[] b){
        int start=0;
        int ans=0;
        for(int i=0;i<b.length;i++){
            if(b[i]!=b[i+1]){
                //return i;
                ans=b[i];
                break;
            }
            if(b[b.length-1]!=b[b.length-2]){
                ans=b[b.length-1];
            }
        }
        return  ans;

    }
}
