package Task_06_Hometask_Loops_and_Arrays;

public class LinearIn {

    public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        // Traverse both arrays
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                // Move to the next element in inner array
                innerIndex++;
            }
            // Move to the next element in outer array
            outerIndex++;
        }

        // If we have gone through all elements in inner array
        return innerIndex == inner.length;
    }

    public static void main(String[] args) {
        int[] outer1 = {1, 2, 4, 6};
        int[] inner1 = {2, 4};
        int[] outer2 = {1, 2, 4, 6};
        int[] inner2 = {2, 3, 4};
        int[] outer3 = {1, 2, 4, 4, 6};
        int[] inner3 = {2, 4};

        System.out.println("linearIn(outer1, inner1): " + linearIn(outer1, inner1)); // Output: true
        System.out.println("linearIn(outer2, inner2): " + linearIn(outer2, inner2)); // Output: false
        System.out.println("linearIn(outer3, inner3): " + linearIn(outer3, inner3)); // Output: true
    }
}
