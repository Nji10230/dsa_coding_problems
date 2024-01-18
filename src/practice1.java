public class practice1 {
    public static void main(String[] args) {
       // int k=arr[n-1]
        int a=0;
        int b=1;
        int temp=0;
        int N=4;
        for(int i=2;i<N;i++){
            temp=b;
            b+=a;
            a=temp;
        }
        System.out.println(b);

    }
}
