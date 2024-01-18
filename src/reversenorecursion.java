public class reversenorecursion {
    static  int rem=0;
    public static int  Reverse(int num)
    {
      // int rem=0;

        // base condition to end recursive calls
        if (num == 0) {
            return rem;
        }

        if (num>0){
            int temp=0;
             temp=num%10;
              rem=rem*10+temp;
              Reverse(num / 10);


        }
        return  rem;
    }
    static boolean palindrome(int n){
        return n==Reverse(n);
    }
    public static void main(String[] args)
    {
        int num = 505;
        System.out.println(palindrome(num));
    }

}
