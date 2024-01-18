public class recursion3 {
    static int count =0;
    public static void main(String[] args) {
        System.out.println(countnum(505500,count));

    }                                         //count no of zeros in the number;

    //static int count =0;
     static int countnum(int n, int count){
        if(n==0){
            return count;
           // System.out.println(count);
        }
        int rem=n%10;
         if (rem==0) {
             return countnum(n/10,count+1);
         }
         return countnum(n/10,count);
     }
}
//
// method 2 is like create another function and passing argument as number and call countno function in it
//static int count1(int n){
//  return countno(int n,0)
// }
// static int countno(int n,int count)
//          if(n==0){
//          return count;
//          }
//          int rem=n%10;
//          if (rem==0) {
//          return countno(n/10,count+1);
//          }
//          return countno(n/10,count);
//}
// }

