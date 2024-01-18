import java.util.*;
public class jjg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
       // int N = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = {1,0,1,0,1,1,1,1,0};

        // Input array elements


        // Initialize variables to keep track of the current and maximum lengths
        int currentLength = 0;
        int maxLength = 0;

        // Iterate through the array
        for (int j : arr) {
            if (j == 1) {
                // If the current element is 1, increment the current length
                currentLength++;
                System.out.println(currentLength);
            } else {
                // If the current element is not 1, update the maximum length if needed
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                // Reset the current length
                currentLength = 0;
            }
        }

        // Update the maximum length if the last part of the array contains contiguous 1's
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        // Print the length of the longest contiguous 1's
        System.out.println(maxLength);

        scanner.close();
    }
}
