
package Task_05_Hometask_Language_Constructs;

import org.apache.commons.lang3.StringUtils;
public class WithoutString8 {
    private String base;
    private String remove;

    // Constructor to initialize base and remove strings
    public WithoutString8(String base, String remove) {
        this.base = base;
        this.remove = remove;
    }

    // Method to remove all instances of the 'remove' string from the 'base' string (case insensitive)
//    public String removeString() {
//        // Use regular expressions with case insensitivity to replace all occurrences of 'remove'
//        return base.replaceAll("(?i)" + remove, "");
//    }

    public String removeString() {
        return StringUtils.removeIgnoreCase(base, remove);
    }

    public static void main(String[] args) {
        // Create objects and test the withoutString function
        WithoutString8 example1 = new WithoutString8("Hello there", "llo");
        System.out.println(example1.removeString());  // Output: "He there"

        WithoutString8 example2 = new WithoutString8("Hello there", "e");
        System.out.println(example2.removeString());  // Output: "Hllo thr"

        WithoutString8 example3 = new WithoutString8("Hello there", "x");
        System.out.println(example3.removeString());  // Output: "Hello there"
    }
}

