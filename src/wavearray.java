import java.util.Arrays;

public class wavearray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int n=5;
        for(int i=0;i<=n-2;i+=2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        System.out.println(Arrays.toString(a));
        }

    }

