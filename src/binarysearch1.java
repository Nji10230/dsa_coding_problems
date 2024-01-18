public class binarysearch1 {
    public static void main(String[] args) {
        int []arr={6,10,17,22,25,28,30};
        int key=26;
     //   celiling(arr,key);
        System.out.println(celiling(arr,key));


    }
    static int celiling(int []b,int key){
        int start=0;
       int end=b.length;
      //  int greatest;
        while (start<=end){
            /* int greatest; */
            int mid=(start+end)/2;
            if(key>b[mid]){

                // greatest=b[mid+1];
                start=mid+1;
            } else if (key<b[mid]) {
                end=mid-1;
              //  greatest=b[mid-1];
            }else {
               // greatest=b[mid];
                   return mid;
            }
        }

        return start;
    }
}
