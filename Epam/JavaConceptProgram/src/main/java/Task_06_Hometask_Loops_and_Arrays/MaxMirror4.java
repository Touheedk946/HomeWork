package Task_06_Hometask_Loops_and_Arrays;

public class MaxMirror4 {

    public static int maxMirror(int[] nums) {
        int maxMirrorLength = 0;

        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                int mirrorLength = end - start + 1;
                int[] subArray = new int[mirrorLength];

                // Extract the sub-array
                for (int k = 0; k < mirrorLength; k++) {
                    subArray[k] = nums[start + k];
                }

                // Check if sub-array has a mirror in the array
                for (int i = 0; i <= nums.length - mirrorLength; i++) {
                    boolean isMirror = true;
                    for (int j = 0; j < mirrorLength; j++) {
                        if (nums[i + j] != subArray[mirrorLength - 1 - j]) {
                            isMirror = false;
                            break;
                        }
                    }
                    if (isMirror) {
                        maxMirrorLength = Math.max(maxMirrorLength, mirrorLength);
                    }
                }
            }
        }

        return maxMirrorLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] arr2 = {1, 2, 1, 4};
        int[] arr3 = {7, 1, 2, 9, 7, 2, 1};

        System.out.println("maxMirror(arr1): " + maxMirror(arr1)); // Output: 3
        System.out.println("maxMirror(arr2): " + maxMirror(arr2)); // Output: 3
        System.out.println("maxMirror(arr3): " + maxMirror(arr3)); // Output: 2
    }
}

