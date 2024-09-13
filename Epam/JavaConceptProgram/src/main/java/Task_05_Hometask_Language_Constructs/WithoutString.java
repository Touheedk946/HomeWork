package Task_05_Hometask_Language_Constructs;

public class WithoutString {
    private String base;
    private String remove;

    // Constructor to initialize base and remove strings
    public WithoutString(String base, String remove) {
        this.base = base;
        this.remove = remove;
    }

    // Method to remove all instances of the 'remove' string from the 'base' string (case insensitive)
    public String removeString() {
        // Use regular expressions with case insensitivity to replace all occurrences of 'remove'
        return base.replaceAll("(?i)" + remove, "");
    }

    public static void main(String[] args) {
        // Create objects and test the withoutString function
        WithoutString example1 = new WithoutString("Hello there", "llo");
        System.out.println(example1.removeString());  // Output: "He there"

        WithoutString example2 = new WithoutString("Hello there", "e");
        System.out.println(example2.removeString());  // Output: "Hllo thr"

        WithoutString example3 = new WithoutString("Hello there", "x");
        System.out.println(example3.removeString());  // Output: "Hello there"
    }
}

