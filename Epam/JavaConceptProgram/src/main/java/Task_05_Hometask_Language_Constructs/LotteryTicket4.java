package Task_05_Hometask_Language_Constructs;
import java.util.Scanner;

public class LotteryTicket4 {

    // Constructor to initialize the three numbers on the lottery ticket
    private int a, b, c;

    public LotteryTicket4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to compute the result based on the rules provided
    public int computeResult() {
        // Calculate the sum of the pairs
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        // Condition 1: If any pair sums to exactly 10, return 10
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }

        // Condition 2: If the sum of ab is exactly 10 more than either bc or ac
        // Need to take some suggestions on this
//        if (ab == bc + 10 || ab == ac + 10) {
//            return 5;
//        }

        // Condition 3: If none of the above conditions are met, return 0
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Enter the three integers a, b, and c
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Create an instance of BlueLotteryTicket
        LotteryTicket4 ticket = new LotteryTicket4(a, b, c);

        // Output the result of the ticket based on the rules
        System.out.println("Result: " + ticket.computeResult());

        sc.close();
    }
}
