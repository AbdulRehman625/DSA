import java.util.Arrays;
public class TwoSum {

        public static boolean findTwoSum(int[] arr, int K) {
            // Step 1: Sort the array
            Arrays.sort(arr);

            // Step 2: Initialize two pointers
            int left = 0;
            int right = arr.length - 1;

            // Step 3: Iterate with the two pointers
            while (left <= right) {
                int currentSum = arr[left] + arr[right];

                if (currentSum == K) {
                    return true; // A pair found
                } else if (currentSum < K) {
                    left++; // Move left pointer to the right to increase the sum
                } else {
                    right--; // Move right pointer to the left to decrease the sum
                }
            }

            // Step 4: No pair found
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {8, 4, 1, 6};
            int K = 11;

            boolean result = findTwoSum(arr, K);
            System.out.println(result ? "Yes" : "No"); // Output: Yes
        }
    }
































   /* public boolean twoSum(int[] arr, int target){
        int n = arr.length;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // For each element arr[i], check every
            // other element arr[j] that comes after it
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair
                // equals the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
        // If no pair is found after checking
        // all possibilities

}

    public static void main(String[] args) {
        TwoSum tt=new TwoSum();
        int target=10;
        int arr[]={4,1,8,6};
        System.out.println(tt.twoSum(arr,target));



    }*/

