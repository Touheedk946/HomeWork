package JavaSimple.TakeInputFromCommandLIne;
/*
    To Run this program follow given commands.
    javac HelloName.java -- > to compile the program
    java HelloName NAME ---> to pass Input from command Line
 */
public class HelloName {
    public static void main(String[] args) {
        // Prompt the user to enter their name
        if (args.length > 0) {
            // Read the name from the command line arguments
            String name = args[0];
            // Display the greeting
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }
}
