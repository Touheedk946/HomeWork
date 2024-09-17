package Task_05_Hometask_Language_Constructs;

public class MaxBlock9 {
    private String str;

    // Constructor to initialize the string
    public MaxBlock9(String str) {
        this.str = str;
    }

    // Method to find the length of the largest block of adjacent identical characters
    public int getMaxBlock() {
        if (str.isEmpty()) {
            return 0;  // If the string is empty, return 0
        }

        int maxBlockLength = 1;  // Initialize max block length
        int currentBlockLength = 1;  // Length of the current block

        // Loop through the string and find the length of the largest block
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlockLength++;  // Increment current block length if adjacent chars are the same
            } else {
                currentBlockLength = 1;  // Reset current block length if chars are different
            }

            // Update max block length if current block is larger
            if (currentBlockLength > maxBlockLength) {
                maxBlockLength = currentBlockLength;
            }
        }

        return maxBlockLength;
    }

    public static void main(String[] args) {
        // Create objects and test the maxBlock function
        MaxBlock9 example1 = new MaxBlock9("hoopla");
        System.out.println(example1.getMaxBlock());  // Output: 2

        MaxBlock9 example2 = new MaxBlock9("abbCCCddBBBxx");
        System.out.println(example2.getMaxBlock());  // Output: 3

        MaxBlock9 example3 = new MaxBlock9("222222");
        System.out.println(example3.getMaxBlock());  // Output: 6
    }
}

