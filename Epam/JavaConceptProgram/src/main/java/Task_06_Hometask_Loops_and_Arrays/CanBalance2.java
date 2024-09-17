package Task_06_Hometask_Loops_and_Arrays;

public class CanBalance2 {

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Now try to find a point where the left sum equals the right sum
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];

            // If left sum equals half of total sum, return true
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};
        int[] arr3 = {10, 10};

        System.out.println("canBalance(arr1): " + canBalance(arr1)); // Output: true
        System.out.println("canBalance(arr2): " + canBalance(arr2)); // Output: false
        System.out.println("canBalance(arr3): " + canBalance(arr3)); // Output: true
    }
}

