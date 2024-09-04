import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        // Read the name entered by the user
        String name = sc.nextLine();

        System.out.println("Hello," + name);

        }
}
