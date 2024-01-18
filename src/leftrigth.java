import java.util.Scanner;

public class leftrigth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();

        // Create an array to store the elements A
        int[] A = new int[N];

        // Input array elements
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Create an array B to store the results
        int[] B = new int[N];

        // Calculate B values
        for (int i = 0; i < N; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate leftSum
            for (int j = 0; j < i; j++) {
                leftSum += A[j];
            }

            // Calculate rightSum
            for (int j = i + 1; j < N; j++) {
                rightSum += A[j];
            }

            // Calculate B[i]
            B[i] = Math.abs(leftSum - rightSum);
        }

        // Print the elements of array B
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();
    }
    }

