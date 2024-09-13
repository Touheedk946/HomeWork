package Task_06_Hometask_Loops_and_Arrays;

public class CountClumps {

    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                // Start of a new clump
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                }
            } else {
                // End of the current clump
                inClump = false;
            }
        }

        return clumpCount;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4};
        int[] arr2 = {1, 1, 2, 1, 1};
        int[] arr3 = {1, 1, 1, 1, 1};

        System.out.println("countClumps(arr1): " + countClumps(arr1)); // Output: 2
        System.out.println("countClumps(arr2): " + countClumps(arr2)); // Output: 2
        System.out.println("countClumps(arr3): " + countClumps(arr3)); // Output: 1
    }
}

