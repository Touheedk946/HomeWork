package Task_06_Hometask_Loops_and_Arrays;

public class MaxSpan1 {

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int lastIndex = findLastIndex(nums, nums[i]);
            int span = lastIndex - i + 1;
            if (span > maxSpan) {
                maxSpan = span;
            }
        }

        return maxSpan;
    }

    // Helper method to find the last occurrence of a given value in the array
    private static int findLastIndex(int[] nums, int value) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;  // Should not happen if value is guaranteed to be in the array
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 1, 3};
        int[] arr2 = {1, 4, 2, 1, 4, 1, 4};
        int[] arr3 = {1, 4, 2, 1, 4, 4, 4};

        System.out.println("Max span of arr1: " + maxSpan(arr1)); // Output: 4
        System.out.println("Max span of arr2: " + maxSpan(arr2)); // Output: 6
        System.out.println("Max span of arr3: " + maxSpan(arr3)); // Output: 6
    }
}
