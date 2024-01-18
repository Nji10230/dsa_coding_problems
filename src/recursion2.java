import static java.lang.System.*;
import static java.lang.System.*;

public class recursion2 {
    public static void main(String[] args) {
        System.out.println(factorial(10));

    }
    static int factorial(int n){
        if(n==1)
            return 1;

        return factorial(n-1)+n;

    }
}
